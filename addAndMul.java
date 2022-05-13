import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class addAndMul {

    public static int logic(int input){

        List<Integer> numberList = new ArrayList<>();
        int sum =0;
        while(input!=0){
            numberList.add(input%10);
            input = input/10;
        }
        Collections.reverse(numberList);

        int beg=0;
        int end =numberList.size()-1;

        while(beg<end){
            sum += numberList.get(beg) * numberList.get(end);
            beg ++;
            end--;
        }

        if(numberList.size()%2!=0){
            sum+=numberList.get(numberList.size()/2);
        }

        if(sum/10>0){
            sum = logic(sum);
        }
        return sum;
    }
    public static void main(String[] args){


        System.out.println(logic(12321));
    }
}
