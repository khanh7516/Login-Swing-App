/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.regex.Pattern;
import model.User;
/**
 *
 * @author Acer
 */
public class UserHandle {
    private final ArrayList<User> users;
    
    public UserHandle() {
        users = new ArrayList<>();
    }
    
    public void createUser(String name, String email, String password) {
        User user = new User(name, email, password);
        users.add(user);
    }
    
    public User findUserByName( String name) {
        for (User user : users ) {
            if (user.getUsername().equals(name)) {
                return user;
            }
        }return null;
    }
    
    public User findUserByEmail( String email) {
        for (User user : users ) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }return null;
    }
    
    public boolean loginUser ( String username, String password) {
        User loginUser = findUserByName(username);
        return (loginUser.getPassword().equals(password));
    }
    
    
    //kiểm tra xem text có rỗng hay không
    public boolean isBlankText( String text) {
        return (text.trim().isEmpty());
    }
    
    //Kiểm tra Username hợp lệ -> thông báo tương ứng với mỗi trường hợp đặt tên sai
    public String validateUsername(String username) {
        if (isBlankText(username)) return "Username không được để trống";
        
        if (findUserByName(username) != null) return "Username đã tồn tại";
       
        return null;
    }
    
    //Kiểm tra email có đúng định dạng không
    public boolean isEmailFormatted(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }
    
    //Kiểm tra email hợp lệ -> thông báo tương ứng với mỗi trường hợp đặt email sai
    public String validateEmail(String email) {
        if (isBlankText(email)) return "Email không được để trống";
        if (findUserByEmail(email) != null) return "Email đã tồn tại";
        if (!isEmailFormatted(email)) return "Email không đúng định dạng";
        return null;
    }
    
    //Kiểm tra mật khẩu và mật khẩu nhập lại có giống nhau hay không
    public static boolean isPasswordMatching(String password, String rePassword) {
        return password.equals(rePassword);
    }
    
    //Kiểm tra mật khẩu có được nhập đúng định dạng không
    public static boolean isPasswordFormatted(String password) {
        String passwordRegex = "^(?=.*[A-Z])(?=.*[.,_\\-;()])[a-zA-Z0-9.,_\\-;()]{7,15}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        return pattern.matcher(password).matches();
    }
    
    //kiểm tra mật khẩu hợp lệ -> thông báo tương ứng với mỗi trường hợp đặt mật khẩu sai
    public String validatePassword(String password, String rePassword) {
        if (isBlankText(password)) return "Mật khẩu không được để trống";
        
        if (!isPasswordFormatted(password)) {
            return """
                   Password không đúng định dạng
                   1. Password dài từ 7 đến 15 ký tự
                   2. Password chứa ít nhất 1 ký tự in hoa
                   3. Password chứa ít nhất 1 ký tự đặc biệt (. , - _ ;)
                   """;
        }
        if (!isPasswordMatching(password, rePassword)) return "Mật khẩu không trùng khớp!";
        
        return null;
    }
    
}
