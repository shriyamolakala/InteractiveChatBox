package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name (enter 'Anon' if you don't want to enter your name): ");
        String name = scanner.nextLine();


        System.out.println("Hi " + name + ", how have you been?");
        String dayMessage = scanner.nextLine();
        dayMessage.toLowerCase(Locale.ROOT);
        String[] negWords = {"terrible", "bad", "okay", "sad", "lazy", "worthless", "ugly", "failure"};
        String[] posWords = {"great", "good", "wonderful", "happy"};
        int i = 0;
        boolean check = true;
        while (check) {
            if (dayMessage.contains(negWords[i])) {
                if (negWords[i] == "bad" || negWords[i] == "terrible" || negWords[i] == "sad") {
                    System.out.println("Why are you feeling " + negWords[i] + "?");
                } else if (negWords[i] == "lazy" || negWords[i] == "worthless" || negWords[i] == "ugly") {
                    System.out.println("Why do you feel ugly?");
                } else if (negWords[i] == "failure") {
                    System.out.println("Why do you feel like a failure?");
                } else {
                    System.out.println("Why do you feel that way?");
                }
                String addMessage = scanner.nextLine();
                System.out.println("What can you do to feel better?");
                addMessage = scanner.nextLine();
                System.out.println("Don't give up! You can do this!");
                System.out.println("Stay positive!");
                check = false;
            } else {
                i++;
                if (i == negWords.length) {
                    check = false;
                    System.out.println("That's wonderful, I'm glad to hear you are doing well!");
                    System.out.println();
                    System.out.println("Is there anything else you would like to say?");
                    dayMessage = scanner.nextLine();
                    System.out.println("Keep up the positivity!");
                    break;
                }
            }
        }

        System.out.println("Thank you for visiting the InteractiveChat, come back whenever you want to!");
        scanner.close();
    }


}
