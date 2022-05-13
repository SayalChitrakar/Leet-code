public class sumOfAlllOddLengthSubArray {
    public static int logic(int[] num){

        int sum = 0;
        int total;
        int len = num.length;
        int intermediate;
        for(int i=0;i<num.length;i++){

            total = len*(i+1);
            intermediate =total/2;
            if(total%2==1){
                intermediate++;
            }
            len--;
            sum+=intermediate*num[i];

        }
        return sum;
    }

    public static void main(String[] args){

        int[] num = {7,6,8,6};
        System.out.println(logic(num));
    }
}
