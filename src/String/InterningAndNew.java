package String;

public class InterningAndNew {
    public static void main(String[] args) {
        String str="Raghav";
//        Raghav-> Madhav
//        This will give us Error
//        str.charAt(0)='M';
//        str.charAt(2)='d';
//        but it will work
        str="Madhav";
        System.out.println(str);
        String t = new String("Raghav");
        String s = "Hello";
//        Hello -> Heylo
        s = s.substring(0,2)+'y'+s.substring(3);
        System.out.println(s);

    }
}
