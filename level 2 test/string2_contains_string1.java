import java.util.*;

public class string2_contains_string1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        contain_str(s1, s2);            //without inbuilt
        contain_str_inbuilt(s1, s2);    //with inbuilt
    }

    private static void contain_str_inbuilt(String s1, String s2) {
        if (s1.contains(s2)) {
            System.out.println("contains");
        } else {
            System.out.println("not contains");
        }
    }
    
    public static void contain_str(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            String str = "";
            for (int j = i; j < s1.length(); j++) {
                char ch = s1.charAt(j);
                str = str + ch;
                if (str.equals(s2)) {
                    System.out.println("contains");
                    return;
                }
            }
        }
        System.out.println("not contains");
    }
}
