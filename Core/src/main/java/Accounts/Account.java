/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounts;

import Exceptions.InsufficientDepositException;
import User.*;

/**
 *
 * @author Lab Informatika
 */
public abstract class Account{
    public String accountNumber;
    protected int balance;
    
    protected int minimalDeposit;
    
    public Account(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    
    public abstract void makeDeposit(int nominal) throws InsufficientDepositException;
}
