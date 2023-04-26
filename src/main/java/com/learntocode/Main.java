package com.learntocode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean keeprunning = true;
        while (keeprunning)
        try {
            Scanner scanner = new Scanner(System.in);
            String[] greetings = {"Hello", "Good Morning", "Hi", "Hola", "Welcome", "Greetings", "Hey", "What's up!", "How are you?", "Yo"};
            System.out.println("Choose a greeting (Pick #'s 1-10): ");
            int choice = scanner.nextInt();
            choice--;
            System.out.println(greetings[choice]);
        } catch (Exception e){
            System.out.println("Your number is invalid.");
        }
    }
}
