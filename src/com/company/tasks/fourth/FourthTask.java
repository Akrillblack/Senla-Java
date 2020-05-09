package com.company.tasks.fourth;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать программу, которая подсчитывает сколько раз употребляется слово в тексте (без учета регистра).
 * Текст и слово вводится вручную.
 */

public class FourthTask {
    private String text = new String();
    private String word = new String();

    public void fourthAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your text: ");
        text = scanner.nextLine().toLowerCase();
        System.out.print("Please enter the word searching for: ");
        word = scanner.nextLine().toLowerCase();

        System.out.println("The quantity of searching word in the text is: "+ wordCount(text, word));
        scanner.close();
    }
    // searching word int the text method
    int wordCount(String text, String word){
        String[] temp = text.split("\\s");
        int count = 0;
        for (String a : temp){
            if(a.equals(word)) count++;
        }
        return count;
    }

}
