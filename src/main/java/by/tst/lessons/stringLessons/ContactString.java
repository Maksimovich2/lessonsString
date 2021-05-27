package by.tst.lessons.stringLessons;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ContactString {
    public String contact(String str1, String str2){
        if(!str1.isEmpty() && !str2.isEmpty()) {
            str1 = str1.concat(str2);
            System.out.println(str1);
            System.out.println("соединение успешно!");
        }
        else {
            throw new IllegalArgumentException("some of the lines are empty.");
        }
        return str1;
    }

    public String equals(String str1, String str2){
        String equal;
        Date date = new Date();
        if(str1.length() == str2.length()){
            equal = "Строки равны!";
            System.out.println(equal);
        }
        else{
            equal = date.toString();
            System.out.println(equal);
        }
       return equal;
    }

    public void countSymbols(String str1) {
        if (!str1.isEmpty()) {
            System.out.println(str1.replace(" ", "").length());
        }
        else {
            throw new IllegalArgumentException("str1 is empty.");
        }
    }
}
