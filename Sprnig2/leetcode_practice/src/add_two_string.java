public class add_two_string {
    public static void main(String[] args) {


        String s1 = "11";
        String s2 = "1";
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry =0;
        StringBuilder result=new StringBuilder();
        while (i>=0||j>=0||carry==1){
            int sum=carry;
            if(i>=0){
                sum=sum+s1.charAt(i)-'0';
                i--;


            }

            if(j>=0){
                sum=sum+s2.charAt(j)-'0';
                j--;

            }
            result.append(sum%10);
            carry=sum/10;

        }
        System.out.println(result.reverse());


    }
}


//Integer.parsInt()