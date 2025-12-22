package String;

import java.util.Scanner;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i = 0,j=0;
        while(j<n && sb.charAt(j)!='.'){
            if(sb.charAt(j)!=' '|| sb.charAt(j)!=','){
                j++;
            }
            else{
                reverseWord(sb,i,j-1);
                i = j +1;
                while(sb.charAt(i)==' ') i++; //if There are Multiple spaces in the sentence
                j = i;
            }
        }
        reverseWord(sb,i,j-1);

        System.out.println(sb);

    }

    public static void reverseWord(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
