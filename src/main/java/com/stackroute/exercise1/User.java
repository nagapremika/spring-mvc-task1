package com.stackroute.exercise1;

import org.springframework.stereotype.Component;

@Component
public class User {    // Data Model
private String message;

    public User(String message) {       //Constructor
        this.message = message;
    }

    public User() {     //Default constructor
    }

    public String getMessage()     // getter()
    {
        return message;
    }

  public void setMessage() {        //Setter()
        this.message ="Welcome to Stackroute";
    }
   public String toString()
    {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
