import java.util.Arrays;
import java.util.HashMap;

public class string_miss_match {
    public static void main(String[] args) {
        String patt="abba";
        String s= "dog cat cat dog";
        String []res=s.split(" ");
        HashMap<Character,String>map=new HashMap<>();
        for(int i=0;i<patt.length();i++){
            for(int j=0;j<res.length;j++){
                map.put(patt.charAt(i),res[j]);
            }


        }
        System.out.println(Arrays.toString(res));
        System.out.println(map);
    }
}
