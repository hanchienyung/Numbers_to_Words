package com.cy.javabootcamp.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class Numbers_to_Words {

    @RequestMapping
    public void translate_num_to_text() {

        String num;
        Integer num_length;
        Integer i;
        String display = "";
        String[] num_units_text = {"", "", "", "hundred", "thousand"};
        String[] one_units_text = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        String[] teen_units_text = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens_units_text = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = keyboard.next();

        num_length = num.length();


        for (i = 1; i <= num_length; i++) {

            if (num_length == 1) {
                display = one_units_text[Integer.valueOf(num)];
            }
            else if (num_length == 2) {

            }

        }
        System.out.println(display);

        /*       if (num_length < 3) {

            }

            else {
                num_units_text(num.charAt(i)






            num.charAt(num_length)
        }
        num.charAt(0);
        num.charAt(1);



        for (i=num.length()-1; i > 0; i--){

            switch ( cvfb)


        }
num_length = num_length()
        num.charAt(num_length)

        System.out.println(num);
        System.out.println(num_length);
        System.out.println(num.charAt(0));
        System.out.println(num.charAt(1));

        //return (num + "  " + num_length + "  " + num.indexOf(num_length));
    }
} */


    }

}

