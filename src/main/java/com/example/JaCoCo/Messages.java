package com.example.JaCoCo;

public class Messages {

    public String getMessage(String name) {
        StringBuilder sb = new StringBuilder();

        if (name == null || name.trim().length() == 0) {
            sb = sb.append("Please provide a name");
        } else {
            sb.append("Hello " + name + "!");
        }

        return sb.toString();
    }
}
