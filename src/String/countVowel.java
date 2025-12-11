package String;

import java.util.Scanner;

public class countVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str = sc.nextLine();
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch)) count++;
        }
        System.out.println("The number of vowel in this string is "+count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a'|| ch=='A') return true;
        if(ch=='e'|| ch=='E') return true;
        if(ch=='i'|| ch=='I') return true;
        if(ch=='o'|| ch=='O') return true;
        if(ch=='u'|| ch=='U') return true;
        return false;
    }
}
