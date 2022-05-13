import java.util.*;

public class adjecentNumberSumInString {
    public static int[] demo(String input){

        ArrayList<Integer> myArr = new ArrayList<Integer>();
        int i;
        int sum =0;
        boolean charStart = false;

        for(i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                sum+=Character.getNumericValue(input.charAt(i));
                charStart=false;

                if(i == input.length()-1){
                    myArr.add(sum);
                }
            }
            else{
                if(!charStart){
                    myArr.add(sum);
                }
                sum=0;
                charStart=true;
            }

        }
        int[] arr = myArr.stream().mapToInt((v)->v.intValue()).toArray();

        return arr;
    }
    public static void main(String[] args){

        System.out.println(Arrays.toString(demo("123Hello word23ld")));
    }
}
