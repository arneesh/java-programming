package com.mkyong.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator{
    
    public static void main(String args[]){
    
    public Pattern pattern;
    public Matcher matcher;}
    
    private static final String PASSWORD_PATTERN =
"((?=.*\\d)(?=.*[a-z])(?=.*[A-Z)(?=.*[@#$%]).{6,20})";

public PasswordValidator(){
    pattern = Pattern.compile(PASSWORD_PATTERN);
}

public boolean validate(final String password){
    
    matcher = pattern.matcher(password);
    return matcher.matches();
}
    
    
    
    
      
    
    
    
    
    
}


