package org.example.SciencePathshala;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserCredentialsValidator {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", Pattern.CASE_INSENSITIVE);
    private final String userName;
    private final String userPassword;

    UserCredentialsValidator(String userName, String userPassword){
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public Boolean validateUser(){
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(userName);
        if(!matcher.find())
            return false;
        return isPresentInUserTable(userName, userPassword);
    }

    private Boolean isPresentInUserTable(String userName, String userPassword){
        /* DB Query to check if user
        present in User Table or not
         */
        return true;
    }
}
