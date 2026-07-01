import java.util.HashSet;

public class remove_dup_in_string {
    public static void main(String[] args) {
        String s1 = "aabbccdda";
        System.out.println(find_dup(s1));


    }

    public static String find_dup(String s1) {
        HashSet<Character> set = new HashSet<>();
        StringBuffer res=new StringBuffer();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                res.append(ch);
            }

        }
        String result=res.toString();




        return result;

    }
}
