import java.lang.reflect.Array;
import java.util.Arrays;

public class SingleNumber {

    public static void calculate(int[] value){

        int i,j;
        Boolean flag = false;
        int notRepeated =value[value.length-1];
        int temp;
        int[] ascArr = new int[value.length];

        for(i=0;i<value.length;i++){
            for(j=i+1;j<value.length;j++) {
                if (value[i] >= value[j]) {
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }
        for(i=0;i<value.length-1;i++){

            if(value[i]!= value[i+1]){
                flag = true;
                notRepeated = value[i];
                break;
            }
            i++;
        }
        System.out.println(notRepeated);
    }
    public static void main(String[] args){

        int[] value = {1,1,2,2,3,3,4};
        calculate(value);
    }
}
