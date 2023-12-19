/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO.AdminDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Pubudu Kasun
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminLoginDTO {

    private int id;
    private String fname;
    private String lname;
    private String email;
    private boolean active;
}
