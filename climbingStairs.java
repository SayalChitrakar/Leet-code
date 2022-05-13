public class climbingStairs {

    public static int calculate(int n){
        if(n== 1 || n == 2){
            return n;
        }

        else{
            int[] dp = new int[n+1];
            int i;
            dp[1] = 1;
            dp[2] = 2;

            for(i=3;i<=n;i++){
                dp[i] = dp[i-1]+dp[i-2];
            }

            return dp[n];
        }

    }
    public static void main(String[] args){

        System.out.println( calculate(2));

    }
}
