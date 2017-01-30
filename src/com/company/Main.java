package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean running = true;
        boolean looping = true;
        boolean exit = false;

        String msg = "";
        String sender = "";
        String receiver = "";

        while (running) {
            while (looping) {
                System.out.println("Insert message. Type \"exit\" to stop the program..");
                msg = sc.nextLine();
                if (msg.equals("exit")) {
                    looping = false; exit = true; running = false;
                } else if (msg.length() == 0) {
                    System.out.println("Your message is empty.");
                } else {
                    looping = false;
                }
            }
            looping = true;
            if (!exit) {
                while (looping) {
                    System.out.println("Who are you?");
                    sender = sc.nextLine();
                    if (sender.length() == 0) {
                        System.out.println("Name not inputted.");
                    } else {
                        looping = false;
                    }
                }
                looping = true;
                while (looping) {
                    System.out.println("Who are you sending this to?");
                    receiver = sc.nextLine();
                    if (receiver.length() == 0) {
                        System.out.println("Name not inputted.");
                    } else {
                        looping = false;
                    }
                }
                Message newMsg = new Message (sender, receiver, msg);
            }
        }

    }
}
