package com.company.tasks.fifth;

import java.util.Scanner;

/**
 * Создать программу, которая в последовательности от 0 до N,
 * находит все числа-палиндромы (зеркальное значение равно оригинальному).
 * Длина последовательности N вводится вручную и не должна превышать 100.
 */

public class FifthTask {
    private int length;
    Scanner scanner = new Scanner(System.in);

    public void fifthAnswer() {
        System.out.print("Please enter sequence length: ");
        length = scanner.nextInt();
        if(length > 0 && length <= 100){
            countPalindrome(length);
        } else{
            System.out.println("Sequence length have to be between 0 and 100! Please try again");
        }
        scanner.close();
    }

    // Finding reverse of number
    static int isPalindrome(int n){
        int rev = 0;
        for (int i = n; i > 0; i /= 10)
            rev = rev * 10 + i % 10;
        return(n == rev) ? 1 : 0;
    }
    // Counting palindromes and printing to console
    static void countPalindrome(int length){
        System.out.print("Palindromes in sequence are: ");
        for (int i = 0; i <= length; i++){
            if (isPalindrome(i)==1)
                System.out.print(i + " ");
        }

    }
}

