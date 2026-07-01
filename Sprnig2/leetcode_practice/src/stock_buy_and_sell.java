public class stock_buy_and_sell {
    public static void main(String[] args) {
        int []arr={7,6,4,3,1};
        System.out.println(stock(arr));

    }

    public static int stock(int[]arr){
        int minprice=arr[0];
        int maxprice=0;
        for(int i=1;i<arr.length;i++){
            if(minprice>arr[i]){
                minprice=arr[i];
            }

            int profit=arr[i]-minprice;
            if(profit>maxprice){
                maxprice=profit;
            }
        }
        System.out.println(minprice+"min");
        return maxprice;
    }
}
