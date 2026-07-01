public class binary {
    public static void main(String[] args) {
        String A="11";
        String B="1";
        StringBuilder result=new StringBuilder();
        int i=A.length()-1;
        int j=B.length()-1;
        int carry=0;
        while(i>=0  || j>=0 || carry==1){
            int sum =carry;
            if(i>=0){
                sum=sum+A.charAt(i) -'0';
                i--;

            }
            if(j>=0){
                sum=sum+B.charAt(j)-'0';
                j--;
            }
            result.append(sum%2);
            carry=sum/2;
        }
        System.out.println(result.reverse().toString());


    }
}
