package com.driver;

import java.util.Date;

public class Mail {
    private Date date;
    private String sender;
    private String message;
    public Mail(Date date, String sender, String message){
        this.date= date;
        this.message=message;
        this.sender=sender;
    }
    public String getMessage(){
        return this.message;
    }
    public Date getDate(){
        return date;
    }
}
