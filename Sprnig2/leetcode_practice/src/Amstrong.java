public class Amstrong {
    public static void main(String[] args) {
        int num=153;
        System.out.println(find_Amstrong(num));

    }

    public static String find_Amstrong(int num){
        int original=num;
        int sum=0;
        int digit=String.valueOf(num).length();
        while (num>0) {
            int dig = num % 10;
            sum = (int) (sum +Math.pow(dig,digit));
            num = num / 10;
        }

        if(sum==original){
            return "this is amstrong number";

        }
        return "this is not an amstrong number";
    }
}
