import java.util.HashSet;

public class missmathinString {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        char result = ' ';
        for (int i = 0; i <s.length(); i++) {
            if(s.isEmpty()){
                result=t.charAt(i);
            }
            for (int j = 0; j < t.length(); j++) {

                if (s.charAt(i) != t.charAt(j) && !s.isEmpty()) {
                    result = t.charAt(j);
                }
            }
        }
        System.out.println(result);
    }
}

