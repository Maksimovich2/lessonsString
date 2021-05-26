package by.tst.lessons.stringLessons;

import java.util.Scanner;

public class Tests {
    public static void main(String[] args) {
        ContactString test = new ContactString();
        Scanner in = new Scanner(System.in);
        System.out.print("str1 = ");
        String str1 = in.nextLine();
        System.out.print("str2 = ");
        String str2 = in.nextLine();
        test.countSymbols(str1);
        test.equals(str1, str2);
        test.contact(str1, str2);
    }


}
