/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Pubudu Kasun
 */
public class SendEmailRegister {

    private String toemail;
    private String myHash;

    public SendEmailRegister(String toemail, String myHash) {
        this.toemail = toemail;
        this.myHash = myHash;
    }

    public void sendMail() {
        String email = "pubuducloud00@gmail.com";
        String password = "gdwbofyivrmvqmjw";

        Properties pr = new Properties();

        pr.put("mail.smtp.auth", "true");
        pr.put("mail.smtp.starttls.enable", "true");
        pr.put("mail.smtp.host", "smtp.gmail.com");
        pr.put("mail.smtp.port", "587");
        pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        pr.put("mail.smtp.debug", "true");

        Session session = Session.getInstance(pr, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });
        
         try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toemail));
            message.setSubject("Email Verification Link");
            message.setText("Click this link to confirm your email address and complete setup for your account."
                    + "\n\nVerification Link: " + "http://localhost:8080/Ecom_final_project/ActivateAccount?key1=" + toemail + "&key2=" + myHash);

            Transport.send(message);

            System.out.println("Successfully sent Verification Link");

        } catch (Exception e) {
            System.out.println("Error at SendingEmail.java: " + e);
        }
    }

}
