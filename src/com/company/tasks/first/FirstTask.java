package com.company.tasks.first;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Создать программу, которая будет сообщать, является ли целое число,
 * введенное пользователем, чётным или нечётным, простым или составным.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

public class FirstTask {
    private int number;

    public void firstAnswer(){
        System.out.print("Please enter the number: ");

        try{
           Scanner scanner = new Scanner(System.in);
           number = scanner.nextInt();
           BigInteger integer = BigInteger.valueOf(number);

           // Calculating if the number is even or odd
           System.out.println((number % 2 == 0) ? "Entered number " + number + " is even;" :
                    "Entered number " + number + " is odd;");

           // Calculating if the number is prime or composite
           System.out.println((integer.isProbablePrime((int) Math.log(number)) ?
                    "Entered number " + number + " is prime;" :
                    "Entered number " + number + " is composite;"));

           scanner.close();
        }
        catch (Exception e){
           System.out.println("Entered number is not integer, please enter an integer number!");
           firstAnswer();
       }

    }


}
