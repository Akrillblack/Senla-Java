package com.company.tasks.second;

import java.util.Scanner;

/**
 * Создать программу, которая будет вычислять и выводить на экран НОК (LCM) (наименьшее общее кратное) и
 * НОД (наибольший общий делитель) (GCD) двух целых чисел, введенных пользователем.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */

public class SecondTask {
    private int a, b;

    public void secondAnswer(){

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter first number: ");
            a = Math.abs(scanner.nextInt());
            System.out.print("Please enter second number: ");
            b = Math.abs(scanner.nextInt());

            System.out.println("LCM of numbers: " + a + " and " + b + " is " + ((a * b) / gcd(a, b)));
            System.out.println("GCD of numbers: " + a + " and " + b + " is "+ gcd(a, b));
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Entered numbers are not positive integers, please enter correct numbers!");
            secondAnswer();
        }

    }
    // Calculating JCD
    public static int gcd(int a, int b) {
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
