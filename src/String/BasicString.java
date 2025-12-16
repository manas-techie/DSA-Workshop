package String;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello";
        System.out.println(str.charAt(4));
        System.out.println(str.length());
//        String s = sc.next(); //input
//        System.out.println("Hi " + s);
//        String str1 = sc.nextLine();
//        System.out.println("Hello "+ str1);
        System.out.println(str.indexOf('o'));
        String a = "abc";
        String b = "dbc";

        System.out.println(a.compareTo(b));

        System.out.println(str.startsWith("He"));  //true
        System.out.println(str.contains("ll")); // true
        System.out.println(str.endsWith("lo"));

        System.out.println(str.toLowerCase()); // Convert all letter into lower alphabet
        System.out.println(str.toUpperCase()); // Convert all letter into upper alphabet

//        concet()
        System.out.println(a.concat(b));

        String s = "abcd";
        System.out.println(s.substring(2)); //print index 2 and after all character
        System.out.println(s.substring(1,4)) ; //print character from  index 1 to index 4-1

    }
}
