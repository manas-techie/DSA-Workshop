package String;

public class MaxValueInNString {
    public static void main(String[] args) {
        String[] str = {"890344","39072","89759"};
//        This wil only work when the value stored in the string are less the capacity of int or long
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < str.length; i++) {
//            int ele = Integer.parseInt(str[i]);
//            max = Math.max(max,ele);
//        }
//        System.out.println(max);

//        Method
        String maxS = str[0];
        for (int i = 1; i < str.length; i++) {
            maxS = max(maxS,str[i]);
        }

        System.out.println(maxS);
    }

    public static String max(String a,String b){
        String tempA = purify(a);
        String tempB = purify(b);

        if(tempA.length()>tempB.length()) return a;
        if(tempA.length()<tempB.length()) return b;
        for (int i = 0; i < tempA.length(); i++) {
            if (tempA.charAt(i) != tempB.charAt(i)) {
                if (tempA.charAt(i) > tempB.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        return b;
    }

    private static String purify(String a) {
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)!= '0') return a.substring(i);
        }
        return a;
    }
}
