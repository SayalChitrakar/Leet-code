import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoOutOfThree {
    public static List<Integer> logic(int[]nums1, int[]nums2, int[]nums3){
        List<Integer> myList = new ArrayList<>();


        HashMap<Integer,Integer> map = new HashMap<>();
        boolean[] isPresent = new boolean[101];
        for(int num:nums1){
            if(!isPresent[num]){
                int count = map.getOrDefault(num,0);
                map.put(num,count+1);
                isPresent[num] =true;
            }
        }
        isPresent = new boolean[101];
        for(int num:nums2){
            if(!isPresent[num]){
                int count = map.getOrDefault(num,0);
                map.put(num,count+1);
                isPresent[num] =true;
            }
        }
        isPresent = new boolean[101];
        for(int num:nums3){
            if(!isPresent[num]){
                int count = map.getOrDefault(num,0);
                map.put(num,count+1);
                isPresent[num] =true;
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            if(entry.getValue()>=2){
                myList.add(entry.getKey());
            }
        }
        System.out.println(map);

        return myList;
    }
    public static void main(String[] agrs){
        int[] nums1 = {3,1};
        int[] nums2 ={2,3};
        int[] nums3 = {1,2};
        System.out.println(logic(nums1,nums2,nums3));
    }
}
