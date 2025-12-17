package String;

import java.util.Scanner;

public class StringBuilderInJava {
    public static void main(String[] args) {
        String s = "manas";
        StringBuilder str1 = new StringBuilder(s);
        System.out.println(str1);
        StringBuilder str = new StringBuilder("Manas");
        System.out.println(str);
        System.out.println(str.length());
        StringBuilder sb = new StringBuilder(10);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        Scanner sc = new Scanner(System.in);

        StringBuilder sb1 = new StringBuilder(sc.nextLine());
        //also
        sb1.setCharAt(2,'M');
        System.out.println(sb1);


    }
}
