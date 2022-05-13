public class palindrome {

    public static boolean  isPalindrome (int number){

        int reminder=0;
        int sum = 0;
        int temp = number;
        while(number>0){

            reminder = number%10;
            sum = (sum*10)+reminder;
            number = number/10;

        }

        return  temp == sum;

    }


    public static void main(String[] args){

        System.out.println(isPalindrome(123));
    }
}
