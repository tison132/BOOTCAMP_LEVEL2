import java.util.*;

public class palindrome_without_reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(s.length() - 1 - i);
            if (c1 == c2) {
                continue;
            } else {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    
    }
}