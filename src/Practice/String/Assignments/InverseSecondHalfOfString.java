package Practice.String.Assignments;

import java.util.Scanner;

//Assignment Question 4
public class InverseSecondHalfOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        StringBuilder str = new StringBuilder(sc.next());
        int length = str.length();
        if(length%2==0) {
            int middle = length/2;
            int i=middle, j=length-1;
            while(i<j){
                char temp = str.charAt(i);
                str.setCharAt(i,str.charAt(j));
                str.setCharAt(j,temp);

                i++;
                j--;
            }

            System.out.println(str);

        }
        else{
            System.out.println("Enter a even size of length.");
        }

    }
}
