import java.util.Arrays;

public class valid_palindrom {
    public static void main(String[] args) {


        String S = "A man, a plan, a canal: Panama";
        String s2 = " ";

        s2 = S.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer rev = new StringBuffer(s2);
        if (s2.equals(rev.toString())) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

