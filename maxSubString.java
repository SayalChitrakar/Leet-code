import javax.sound.midi.SysexMessage;

public class maxSubString {

    public static int find(int[] myInt){


        int i;
        int sum = myInt[0];
        int max=myInt[0];

        for(i=1;i<myInt.length;i++){

        if(sum < 0){
            sum = myInt[i];
        }
        else{
            sum = sum+= myInt[i];
        }
        max = Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args){

        int[] myInt = {-2,-3,-1,-6};
        System.out.println(find(myInt));
    }
}
