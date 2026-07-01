import java.util.Arrays;

public class charletter {
    public static void main(String[] args) {
        String[] S ={"h","e","l","l","o"};
        String []result=new String[S.length];
        int j=0;
        for(int i=S.length-1;i>=0;i--){
            result[j]=S[i];
            j++;
        }
        System.out.println(Arrays.toString(result));

    }
}
