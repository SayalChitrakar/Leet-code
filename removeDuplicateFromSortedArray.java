import java.util.Arrays;

public class removeDuplicateFromSortedArray {

    public static void remove(int[] input){

        int i, j =0;
        int[] temp = new int[input.length];

        for(i=0;i<input.length-1;i++){
            if(input[i]!=input[i+1]){
                temp[j++] = input [i];
            }
        }

        for(i=0;i<temp.length;i++){

            input[i]=temp[i];
        }
    System.out.println(Arrays.toString(input));
    }
    public static void main(String[] args){

        int [] input = {1,1,1};
        remove(input);

    }
}
