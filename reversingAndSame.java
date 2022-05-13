import java.util.Arrays;

public class reversingAndSame {
    public static boolean buddyString(String s, String goal){

        char[] sArr = s.toCharArray();
        char[] goalArr = goal.toCharArray();
        char temp =' ';

        if(sArr.length!=goalArr.length){
            return false;
        }
        for(int i =0;i<s.length();i++){

            for(int j=i+1;j<s.length();j++){

                sArr=s.toCharArray();
                temp = sArr[i];
                sArr[i]=sArr[j];
                sArr[j] =temp;

                if(Arrays.equals(sArr,goalArr)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

        String s ="ab";
        String goal ="ab";
        System.out.println(buddyString(s,goal));
    }

}
