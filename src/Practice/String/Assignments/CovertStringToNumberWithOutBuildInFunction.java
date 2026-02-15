package Practice.String.Assignments;


//Assignment Qustion 5
public class CovertStringToNumberWithOutBuildInFunction {
    public static void main(String[] args) {

        int num1 = stringToNum("078");
        int num2 = stringToNum("89");
        int num3 = stringToNum("3");
        int num4 = stringToNum("-123");
        System.out.println(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);


    }

    public static int stringToNum(String str) {
        int result = 0;
        int start = 0;
        int sign = 1;


        if (str.charAt(0) == '-') {
            sign = -1;
            start = 1;
        }

        for (int i = start; i < str.length(); i++) {
            result = result * 10 + (str.charAt(i) - '0');
        }

        return result * sign;
    }
}
