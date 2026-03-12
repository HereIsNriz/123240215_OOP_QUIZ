/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.spent.core;

import java.util.Scanner;
import Accounts.*;
import Exceptions.*;
import Services.*;
import User.*;

/**
 *
 * @author Lab Informatika
 */
public class Core {
    private static int numOfUser = 0;
    
    public static void main(String[] args) throws UnderageException, InsufficientDepositException{
        String userInput;
        boolean acces = true;
        
        Scanner sc = new Scanner(System.in);
        while (acces) {
            mainMenu();
            userInput = sc.nextLine();
            switch (userInput) {
                case "1":
                    makeDeposit();
                    break;
                case "2":
                    withdrawMoney();
                    break;
                case "3":
                    createNewAccount();
                    break;
                case "4":
                    transferMoney();
                    break;
                case "5":
                    System.out.println("Thank you");
                    acces = false;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    private static void mainMenu(){
        System.out.println("-----  SPENT DIGITAL  -----");
        System.out.println("1. Make deposit");
        System.out.println("2. Withdraw money");
        System.out.println("3. Create new account");
        System.out.println("4. Transfer money");
        System.out.print("Your input: ");
    }
    
    private static void makeDeposit(){
        if (numOfUser == 0) {
            System.out.println("No Account Yet, Please Create New Account");
        }else{
            
        }
    }
    
    private static void withdrawMoney(){
        if (numOfUser == 0) {
            System.out.println("No Account Yet, Please Create New Account");
        } else {

        }
    }
    
    private static void createNewAccount() throws UnderageException, InsufficientDepositException{
        User user = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("-----  CREATE NEW ACCOUNT  -----");
        try {
            System.out.print("Enter your NIK: ");
            String userNIK = sc.nextLine();
            System.out.print("Enter your Name: ");
            String userName = sc.nextLine();
            System.out.print("Enter your age: ");
            int userAge = sc.nextInt();

            user = new User(userName, userNIK);
            user.setAge(userAge);
            System.out.println("-----  CREATE ACCOUNT  -----");
            System.out.println("Account type: ");
            System.out.println("1. Savings");
            System.out.println("2. Investment");
            System.out.println("3. FX (Foreign Currency)");
            System.out.print("Your input: ");
            String accountSelection = sc.nextLine();
            switch (accountSelection) {
                case "1":
                    SavingsAccount sa = new SavingsAccount(user.getUserNIK());
                    System.out.println("--- New Savings ---");
                    System.out.print("Make deposit: ");
                    int savingsDeposit = sc.nextInt();
                    sa.makeDeposit(savingsDeposit);
                    System.out.println("New Savings Account Successfully Created! Your Account Number is: " + sa.accountNumber);
                    break;
                case "2":
                    InvestmentAccount ie = new InvestmentAccount(user.getUserNIK());
                    System.out.println("--- New Investment ---");
                    System.out.print("Make deposit: ");
                    int investmentDeposit = sc.nextInt();
                    ie.makeDeposit(investmentDeposit);
                    System.out.println("New Savings Account Successfully Created! Your Account Number is: " + ie.accountNumber);
                    break;
                case "3":
                    ValasAccount va = new ValasAccount(user.getUserNIK());
                    System.out.println("--- New Valas ---");
                    System.out.print("Make deposit: ");
                    int valasDeposit = sc.nextInt();
                    va.makeDeposit(valasDeposit);
                    System.out.println("New Savings Account Successfully Created! Your Account Number is: " + va.accountNumber);
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("Create Account Success!");
        } catch (UnderageException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
        }
    }
    
    private static void transferMoney(){
        if (numOfUser == 0) {
            System.out.println("No Account Yet, Please Create New Account");
        } else {

        }
    }
}
