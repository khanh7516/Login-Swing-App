/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class User {
    private String username;
    private String email;
    private String password;
    
    public User( String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setUsername( String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail( String email) {
        this.email = email;
    }
    
    public void setPassword (String password) {
        this.password = password;
    }
    
    
    @Override
    public String toString() {
        return "User: " + username + "\n" + "Email: " + email;
    }
    
}
