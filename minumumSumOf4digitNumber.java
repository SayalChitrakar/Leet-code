import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class minumumSumOf4digitNumber {

    public static int logic(int num){

        List<Integer> numList = new ArrayList<>();
        int sum = 0;
        while(num!=0){
            numList.add(num%10);
            num = num/10;
        }
        Collections.sort(numList);
        int new1 = numList.get(0)*10+numList.get(2);
        int new2 = numList.get(1)*10+numList.get(3);


        return new1+new2;
    }
    public static void main(String[] args){

        System.out.println(logic(1239));
    }
}
