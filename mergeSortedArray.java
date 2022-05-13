import java.util.Arrays;

public class mergeSortedArray {


    public static void merger (int[] nums1, int m, int[] nums2, int n){

        int i,j,k;
        int temp,temp1;

        for(i=0;i<nums1.length;i++){
            for(j=0;j<nums2.length;j++){
                if(nums2[j]<nums1[i]){
                    temp = nums1[i];
                    nums1[i]=nums2[j];

                    for(k=0;k<n;k++){
                        if(temp<nums2[k]){
                            nums2[j] = temp;
                            break;
                        }
                    }

                }
            }
            if(i >=m){
                nums1[i] = nums2[i-m];
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args){

        int[] nums1 = {4,5,6,0,0,0};
        int[] nums2 ={1,2,3};
        merger(nums1,3,nums2,3);
    }

}
