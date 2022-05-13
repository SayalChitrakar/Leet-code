import java.util.Arrays;
import java.util.Scanner;

public class FindCommonLetters {

    public static int commonFinder(String[] inputs,int input_length){
        String commonString= inputs[0];
        String temp ="";
        int i,j,k;

        for(i=1;i<inputs.length;i++){
            commonString = commonString.replaceAll("(.)\\1+","$1");
            for(j=0;j<commonString.length();j++){
                for(k=0;k<inputs[i].length();k++){
                    if(commonString.charAt(j)== inputs[i].charAt(k)){
                        temp+= commonString.charAt(j);
                        break;
                    }
                }
            }
            commonString = temp;
            temp = "";
        }
        return commonString.length();
    }
    public static void main(String[] args){


        //Taking input length input from the user.
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Insert the array length");

        int input_length = takeInput.nextInt();
        int i;
        //taking arrays of string from user.
        String[] inputs = new String[input_length];
        takeInput.nextLine();
        for(i=0;i<input_length;i++){
            inputs[i] = takeInput.nextLine();
        }

        System.out.println( commonFinder(inputs,input_length));
    }
}
