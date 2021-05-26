package by.tst.lessons.stringLessons;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ContactString {
    public String[] contact(String str1, String str2){
        if(!str1.isEmpty() && !str2.isEmpty()) {
            str1 = str1.concat(str2);
            System.out.println(str1);
            System.out.println("success!");
        }
        if(str1.isEmpty()) {
            throw new IllegalArgumentException("str1 is empty.");
        }
            if (str2.isEmpty()) {
                throw new IllegalArgumentException("str2 is empty.");
            }
        return new String[]{str1, str2};
    }

    public String[] equals(String str1, String str2){
        if(str1.length() == str2.length()){
            System.out.println("Строки равны!");
        }
        if(str1.length() != str2.length()){
            System.out.println(LocalDateTime.now());
        }
       return new String[]{str1, str2};
    }

    public String countSymbols(String str1) {
        if (!str1.isEmpty()) {
            System.out.println(str1.replace(" ", "").length());
        }
        else {
            throw new IllegalArgumentException("str1 is empty.");
        }
        return str1;
    }
}
