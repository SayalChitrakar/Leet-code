import java.util.Arrays;

public class richestCostumer {
    public static int logic(int[][] accounts){

        int max =0;
        for(int[]money:accounts){

            if(Arrays.stream(money).sum()>max){
                max = Math.max(Arrays.stream(money).sum(),max);
            }
        }
        return max;
    }
    public static void main(String[] args){

        int[][] accounts ={{1,2,3},{3,2,1}};
        System.out.println(logic(accounts));
    }

}
