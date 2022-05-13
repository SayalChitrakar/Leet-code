import java.util.Arrays;

public class RemoveElement {

    public static int[] remove(int [] input, int val){

        int i,j=0;
        for(i=0;i<input.length;i++){

            if(input[i]!=val){
                input[j]=input[i];
                j++;
            }
        }
        return input;
    }

    public static void main(String[] args){
        int [] input = {1,2,1};
        System.out.println( Arrays.toString(remove(input,2)));

    }
}
