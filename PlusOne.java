import java.util.Arrays;

public class PlusOne {

    public static int[] finder(int[] digits){

        int i;
        int counter =0;
        int[] newNumber = new  int[digits.length+1];

        for(i=digits.length-1;i>=0;i--){

            if(digits[i]+1>9){
                digits[i] = 0;
                counter ++;

            }
            else{
                digits[i]+=1;
                break;
            }

        }
        if(counter == digits.length) {
            newNumber[0]=1;
            return newNumber;
        }
        else{
            return digits;
        }

    }

    public static void main(String[] args){
       int [] myInt = {9,9};
       System.out.println(Arrays.toString(finder(myInt)));
    }
}
