/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.AdminDTO.AdminForgotPasswordDTO;
import DTO.UserForgetPwDTO;
import java.util.Properties;
import java.util.Random;
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
public class SendForgotOTP {

    public String getRandom() {
        Random rdm = new Random();
        int number = rdm.nextInt(999999);

        return String.format("%06d", number);
    }

    public boolean sendEmail(UserForgetPwDTO forgetPwDTO) {
        boolean send = false;

        String toEmail = forgetPwDTO.getEmail();
        String fromEmail = "pubuducloud00@gmail.com";
        String password = "gdwbofyivrmvqmjw";
        try {

            Properties pr = new Properties();
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.put("mail.smtp.port", "587");
            pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            pr.put("mail.smtp.debug", "true");

            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("User Forgot Password");
            message.setText("Please forgot password your account using this code : " + forgetPwDTO.getCode());
            Transport.send(message);
            send = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return send;
    }
    
    
     public boolean sendAdminEmail(AdminForgotPasswordDTO afpdto) {
        boolean send = false;

        String toEmail = afpdto.getEmail();
        String fromEmail = "pubuducloud00@gmail.com";
        String password = "gdwbofyivrmvqmjw";
        try {

            Properties pr = new Properties();
            pr.put("mail.smtp.auth", "true");
            pr.put("mail.smtp.starttls.enable", "true");
            pr.put("mail.smtp.host", "smtp.gmail.com");
            pr.put("mail.smtp.port", "587");
            pr.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            pr.put("mail.smtp.debug", "true");

            Session session = Session.getInstance(pr, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            });

            Message message = new MimeMessage(session);

            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject("User Forgot Password");
            message.setText("Please forgot password your account using this code : " + afpdto.getCode());
            Transport.send(message);
            send = true;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return send;
    }
    
}
