package by.tst.lessons.stringLessons;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class ContactString {
    public void contact(String str1, String str2){
        if(str1.length() != 0 && str2.length() != 0) {
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

    }

    public void equals(String str1, String str2){
        if(str1.length() == str2.length()){
            System.out.println("Строки равны!");
        }
        if(str1.length() != str2.length()){
            System.out.println(LocalDateTime.now());
        }
    }

    public void countSymbols(String str1) {
        if (!str1.isEmpty()) {
            System.out.println(str1.replace(" ", "").length());
        }
        else {
            throw new IllegalArgumentException("str1 is empty.");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String str1 = in.nextLine();
        System.out.print("Введите строку 2: ");
        String str2 = in.nextLine();
        ContactString test = new ContactString();
        test.countSymbols(str1);
        test.equals(str1, str2);
        test.contact(str1, str2);

    }
}
