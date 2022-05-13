public class reversePowerSum {

    public static int reverser(int input){
        int power=1 ;
        int i,initial=1,multiplier;
        int finalAns =0;
        int reversed =0;

        //Reversing the number
        while(input != 0) {
            int digit = input % 10;
            reversed = reversed * 10 + digit;
            input /= 10;
        }

        int last = reversed%10;

        // Calculating the power sum
        while(reversed!=0){
            multiplier=reversed%10;
            reversed=reversed/10;
            if(reversed!=0){
                power=reversed%10;
            }
            else{
                power = last;
            }
            for(i=1;i<=power;i++){
                initial*=multiplier;

            }
            finalAns += initial;
            initial=1;
        }

    return finalAns;
    }
    public static void main(String[] args){

        System.out.println(reverser(145));
    }
}
