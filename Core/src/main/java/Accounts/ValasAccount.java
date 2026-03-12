/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounts;

import Exceptions.InsufficientDepositException;

/**
 *
 * @author Lab Informatika
 */
public class ValasAccount extends Account {
    public ValasAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void makeDeposit(int nominal) throws InsufficientDepositException {
        minimalDeposit = 50;
        if (nominal < minimalDeposit) {
            throw new InsufficientDepositException("Sorry but you need to deposit at least: $ " + minimalDeposit);
        }
        balance += nominal;
    }
    
}
