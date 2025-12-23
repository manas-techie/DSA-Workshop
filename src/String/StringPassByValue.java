package String;

public class StringPassByValue {
    public static void main(String[] args) {
//        String is pass by value not by reference
        String s = "manas";
        System.out.println(s);
        change(s);
        System.out.println(s);
    }

    private static void change(String s) {
        s = "Manas";
    }
}
