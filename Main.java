package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello! Welcome to the InteractiveChat!");
        System.out.println();
        userInfo();
        printMessage();
        System.out.println("Thank you for visiting the InteractiveChat, come back whenever you'd like!");

    }

    public static void userInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first name (press enter to stay anonymous): ");
        String name = scanner.nextLine();

        if (name.isEmpty()){
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
        String[] posWords = {"great", "good", "wonderful", "happy", "better", "fine", "amazing", "super", "superb"};
        int i = 0;
        boolean check = true;
        while (check) {

            if (dayMessage.contains(negWords[i])) {
                if (negWords[i] == "bad" || negWords[i] == "terrible" || negWords[i] == "sad") {
                    System.out.println("Why are you feeling " + negWords[i] + "?");
                } else if (negWords[i] == "lazy" || negWords[i] == "worthless" || negWords[i] == "ugly") {
                    System.out.println("Why do you feel " + negWords[i] + "?");
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
                    break;
                }
            }
        }

        i = 0;
        check = true;

        while(check) {
            if(dayMessage.contains(posWords[i])) {
                if(posWords[i] == "great" || posWords[i] == "good" || posWords[i] == "wonderful" || posWords[i] == "fine" || posWords[i] == "amazing" || posWords[i] == "super" || posWords[i] == "superb") {
                    System.out.println("That's wonderful, I'm glad to hear you are doing " + posWords[i] + "!" );
                    System.out.println();
                    System.out.println("Is there anything else you would like to say?");
                    dayMessage = scanner.nextLine();
                    System.out.println("Keep up the positivity!");
                } else if(posWords[i] == "happy") {
                    System.out.println("That's wonderful, I'm glad you are " + posWords[i] + "!");
                    System.out.println();
                    System.out.println("Is there anything else you would like to say?");
                    dayMessage = scanner.nextLine();
                    System.out.println("Keep up the positivity!");
                } else if(posWords[i] ==  "better") {
                    System.out.println("That's wonderful, I'm glad you have been feeling " + posWords[i] + "!");
                }
                else {
                    System.out.println("That's wonderful, I'm glad to hear that!");
                }

            }
            else {
                i++;
                if (i == posWords.length) {
                    check = false;
                    break;
                }
            }
        }
        scanner.close();
    }
}






