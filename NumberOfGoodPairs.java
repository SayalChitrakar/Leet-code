import java.util.HashMap;

public class NumberOfGoodPairs {

    public static int logic(int[] nums){

        int sum = 0;
        HashMap<Integer,Integer> numsMap = new HashMap<>();
        for (int j : nums) {
            numsMap.put(j, 0);
        }

        for(int num:nums){
          sum+=numsMap.put(num,numsMap.get(num)+1);
        }

        return sum;
    }
    public static void main(String[] args){

        int[] nums = {1,2,3,1,1,3};
        System.out.println(logic(nums));
    }
}
