/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Lab Informatika
 */
public class InsufficientDepositException extends Exception {

    /**
     * Creates a new instance of <code>InsufficientDepositException</code>
     * without detail message.
     */

    /**
     * Constructs an instance of <code>InsufficientDepositException</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public InsufficientDepositException(String msg) {
        super(msg);
    }
}
