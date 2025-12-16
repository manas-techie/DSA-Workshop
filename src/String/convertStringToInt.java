package String;

public class convertStringToInt {
    public static void main(String[] args) {
        int num = 10;
        String str = ""+num;
        System.out.println(((String) str).getClass().getSimpleName());
    }
}
