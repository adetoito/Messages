package com.company;

import java.util.*;

public class MessageList {

    public ArrayList<Message> log = new ArrayList();

    public MessageList () {}

    public void retrieveLog () {
        for (int i = 0; i < log.size(); i++) {
            System.out.print(log.get(i).sender + " (" + log.get(i).date + ", " + log.get(i).timestamp + "): ");
            System.out.println(log.get(i).message);
        }
    }

    public void appendMessage (Message msg) {
        log.add(msg);
    }

}
