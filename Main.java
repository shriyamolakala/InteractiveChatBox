package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        userInfo();
        printMessage();
        System.out.println("Thank you for visiting the InteractiveChat, come back whenever you'd like!");

    }

    public static void userInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name (enter 'Anon' if you want to be anonymous): ");
        String name = scanner.nextLine();

        if (name.contains("anon") || name.contains("Anon")){
            System.out.println("Hi, how have you been?");
        } else {
            System.out.println("Hi " + name + ", how have you been?");
        }
    }

    public static void printMessage() {
        Scanner scanner = new Scanner(System.in);
        String dayMessage = scanner.nextLine();
        dayMessage.toLowerCase(Locale.ROOT);
        String[] negWords = {"terrible", "bad", "okay", "sad", "lazy", "worthless", "ugly", "failure", "not"};
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
        scanner.close();
    }
}



