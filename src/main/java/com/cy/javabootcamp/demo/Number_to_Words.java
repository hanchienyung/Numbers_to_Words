package com.cy.javabootcamp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Number_to_Words {

    String[] num_unit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    String[] tens_unit = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    String result = "";

    private String translate_to_words(int num) {
        String[] num_unit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens_unit = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String result = "";

        if (num < 20) {
            result = num_unit[num];
        }
        else if (num < 100) {
            result = tens_unit[num / 10] + " " + num_unit[num % 10];
        }

        else if (num < 1000) {
            result = num_unit[num / 100] + " hundred" + " " + translate_to_words(num % 100);
        }

        else if (num < 1000000) {
            result = translate_to_words( num / 1000) + " thousand " + " " + translate_to_words(num % 1000);
        }

        else if (num < 100000000) {
            result = translate_to_words( num / 1000000) + " million " + " " + translate_to_words(num % 1000000);
        }

        return (result);
    }



    @RequestMapping
    public void get_num() {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number to convert to words: ");
        num = keyboard.nextInt();

        if (num > 99999999){
            System.out.println("Number " + num + " entered cannot be greater than 99 999 999. ");
        }
        else {  // call function to convert number
            System.out.println(translate_to_words(num));
        }

    }

}





