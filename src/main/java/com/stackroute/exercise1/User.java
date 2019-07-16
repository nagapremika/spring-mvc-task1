package com.stackroute.exercise1;

import org.springframework.stereotype.Component;

@Component
public class User {
private String message;

    public User(String message) {
        this.message = message;
    }

    public User() {
    }

    public String getMessage()
    {
        return message;
    }

  public void setMessage() {
        this.message ="Welcome to Stackroute";
    }
   public String toString()
    {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
