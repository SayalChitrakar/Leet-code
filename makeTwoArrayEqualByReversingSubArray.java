import java.util.HashMap;

public class makeTwoArrayEqualByReversingSubArray {
    public static boolean canBeEqual(int[] target, int[] arr){

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: target){
            int count = map.getOrDefault(num,0);
            map.put(num,count+1);
        }

        for(int num:arr){
            if(map.containsKey(num)&&map.get(num)>0){
                map.put(num,map.get(num)-1);
            }
            else{return false;}

        }
        return true;
    }
    public static void main(String[] args){

        int[] target = {1,1,1,1,1};
        int[] arr = {1,1,1,1,1};
        System.out.println(canBeEqual(target,arr));
    }
}
