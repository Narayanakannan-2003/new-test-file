import java.util.HashSet;

public class string_duplicate {
    public static void main(String[] args) {
        String s1="aabbccdd";
        String s2="";
        HashSet<Character>dup=new HashSet<>();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            char ch =s1.charAt(i);
            if(!dup.contains(ch)){
                dup.add(ch);
                s2=s2+ch;

            }
        }
        System.out.println(s2);

    }
}
