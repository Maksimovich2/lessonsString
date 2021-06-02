package by.tst.lessons.stringLessons;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class ContactString {
    public String contact(String str1, String str2){
        if(str1 != null  && str2 != null && !str1.isEmpty() && !str2.isEmpty()) {
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
        String equal = "oops!";
       if(str1 != null  && str2 != null && !str1.isEmpty() && !str2.isEmpty()) {
            if (str1.length() == str2.length()){
                equal = "strings are equal!";
            System.out.println(equal);
            }
        else{
                System.out.println("Time now: " + LocalDate.now());
        }
       }
       return equal;
    }


    public void countSymbols(String str1) {
        if (str1!=null && !str1.isEmpty()) {
            System.out.println(str1.replace(" ", "").length());
        }
        else {
            throw new IllegalArgumentException("str1 is empty.");
        }
    }
}
