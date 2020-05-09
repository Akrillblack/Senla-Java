package com.company.tasks.third;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать программу, которая будет:
 * подсчитывать количество слов в предложении
 * выводить их в отсортированном виде
 * делать первую букву каждого слова заглавной.
 * Предложение вводится вручную. (Разделитель пробел (“ ”)).
 */

public class ThirdTask {
    String sentence = new String();


    public void thirdAnswer(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your sentence: ");
        sentence = scanner.nextLine();

        // split spring array with space separator and count length
        System.out.println("There are " + sentence.split("\\s").length + " words in your sentence.");

        // sorted string array
        System.out.println("Here is your sorted sentence: " + sorted(sentence));

        // capitalize first letter in each word
        System.out.println("Here are capitalized first letters in your sentence: " + firstLetterToUpperCase(sentence));

        scanner.close();
    }
    // capitalizing first letter in each word method
    String firstLetterToUpperCase(String sentence){
        String[] temp = sentence.split("\\s");
        String caps = "";
        for (String a : temp){
            String first = a.substring(0, 1); // takes first letter as substring
            String other = a.substring(1); // takes all other letters as substring
            caps += first.toUpperCase() + other.toLowerCase()+ " ";
        }
        return caps.trim();
    }
    // sorting words in string array method
     String sorted(String sentence){
        String[] temp = sentence.split("\\s");
        Arrays.sort(temp);
        return Arrays.toString(temp);
     }

}
