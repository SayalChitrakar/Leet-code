import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class maximum69number {
    public static int logic(int num){

        List<Integer> numList = new ArrayList<>();

        while(num>0){
            numList.add(num%10);
            num = num/10;
        }
        Collections.reverse(numList);
        int newNum =0;
        boolean seenSix = false;
        for(int i=0;i<numList.size();i++){
            if(!seenSix && numList.get(i)==6){
                seenSix =true;
                numList.remove(i);
                numList.add(i,9);
            }
            newNum=newNum*10 + numList.get(i);
        }

        return newNum;
    }

    public static void main(String[] args){

        int num = 9669;
        System.out.println(logic(num));
    }
}
