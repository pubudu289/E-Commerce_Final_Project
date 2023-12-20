/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.AdminDTO;

/**
 *
 * @author Pubudu Kasun
 */

public class AdminForgotPasswordDTO {
    private String email;
    private String code;

    public AdminForgotPasswordDTO(String email, String code) {
        this.email = email;
        this.code = code;
    }

    public AdminForgotPasswordDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
