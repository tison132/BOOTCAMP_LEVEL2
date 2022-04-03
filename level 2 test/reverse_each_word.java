import java.util.*;

public class reverse_each_word {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        rev_word1(s); // with inbuilt
        rev_word2(s); // without inbuilt

    }

    private static void rev_word1(String s) {
        String ans = "";
        String arr[] = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            ans = ans + arr[i] + " ";
        }
        System.out.println(ans);
    }

    private static void rev_word2(String s) {
        String ans = "";
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                ans = str + " " + ans;
                str = "";
            } else {
                str = str + ch;
            }
        }
        ans = str + " " + ans;
        System.out.println(ans);
    }
}
