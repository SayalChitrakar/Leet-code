import java.util.Scanner;

public class FindCommonLetterArray {
    public static int commonFinder(String[] inputs,int input_length){

        int[] alpha = new int[26];
        int count = 0;

        for(int i =0;i<input_length;i++){
            boolean[] isAlphaPresent = new boolean[26];
            for(int j = 0;j<inputs[i].length();j++){
                if(!isAlphaPresent[inputs[i].charAt(j)-'a']){
                    isAlphaPresent[inputs[i].charAt(j)-'a'] = true;
                    alpha[inputs[i].charAt(j)-'a']++;
                }
            }
        }
        for (int j : alpha) {
            if(j>=input_length){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){


        //Taking input length input from the user.
        System.out.println('b'-'a');
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
