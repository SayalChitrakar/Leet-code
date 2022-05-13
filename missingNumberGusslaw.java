public class missingNumberGusslaw {
    public static int logic(int[] nums){

        int sum = 0;
        for(int num:nums){

            sum+=num;
        }

        int n = nums.length+1;
        return (n*(n-1)/2)-sum;

    }
    public static void main(String[] args){
        int[] nums = {3,0,1};
        System.out.println(logic(nums));
    }
}
