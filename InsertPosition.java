public class InsertPosition {

    public static int detector(int[] nums, int target){

        int flag=-1;
        int index = 0;
        int i;
        for(i=0;i<nums.length;i++){

            if(nums[i] == target){
                flag = 0;
                index = i;
                break;
            }

        }
        if(flag == -1){
            for(i = 0;i<nums.length;i++){

                     if(i==nums.length-1 && nums.length!=1){
                         index = nums.length;
                     }
                     else if(nums[i]> target){
                        index = i;
                        break;
                    }
            }
        }


        return index;
    }
    public static void main(String[] args){

        int[] nums = {1};
        int target = 2;

       System.out.println(detector(nums,target));
    }
}
