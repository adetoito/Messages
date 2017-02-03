package com.company;

import java.util.*;
import java.text.*;

public class Message {

    public String sender;
    public String message;
    public String timestamp;
    public String date;

    public Message (String sndr, String msg) {
        timestamp = returnTime();
        date = returnDate();
        sender = sndr;
        message = msg;
    }

    public String returnTime () {
        DateFormat timef = new SimpleDateFormat ("hh:mm a");
        Date time = new Date ();
        return timef.format(time.getTime());
    }

    public String returnDate () {
        DateFormat datef = new SimpleDateFormat ("MM/dd/yy");
        Date date = new Date();
        return datef.format(date.getTime());
    }

}
