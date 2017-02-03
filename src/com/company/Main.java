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

        String yesOrNo;

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
                MessageList msgLog = new MessageList();
                Message newMsg = new Message (sender, msg);

                msgLog.appendMessage(newMsg);
                msgLog.retrieveLog();

                while (looping) {
                    System.out.println("Would you like to send a message? Yes or No?");
                    yesOrNo = sc.nextLine().toLowerCase();
                    if (yesOrNo.equals("yes")) {
                        looping = false;
                    } else if (yesOrNo.equals("no")) {
                        running = false; looping = false;
                    } else {
                        System.out.println("Invalid answer. Type \"Yes\" or \"No\".");
                    }
                }
                looping = true;
                System.out.println("");
            }
        }

    }
}
