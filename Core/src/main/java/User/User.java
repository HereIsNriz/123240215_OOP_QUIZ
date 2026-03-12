/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

import Exceptions.UnderageException;

/**
 *
 * @author Lab Informatika
 */
public class User {
    public String userName;
    private String userNIK;
    private int age;
    
    private int minimalAge = 17;
    
    public User(String userName, String userNIK){
        this.userName = userName;
        this.userNIK = userNIK;
    }
    
    public String getUserNIK(){
        return this.userNIK;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge (int age) throws UnderageException{
        if (age < minimalAge) {
            throw new UnderageException("Sorry but you need to be at least 17 years old!");
        }
        this.age = age;
    }
}
