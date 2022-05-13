import java.util.HashMap;

public class LongestSubstringWithOutRepChar {

    public static int findLongest(String s){

        int i;
        int max = 0;
        String newString = "";

        if(s.isEmpty()){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        for(i=0;i<s.length();i++){
            if(newString.contains(""+s.charAt(i))){
                newString=newString.substring(newString.indexOf(s.charAt(i))+1);
            }

            newString+=s.charAt(i);
            if(max<newString.length()){
                max= newString.length();
            }
            System.out.println(newString);

        }

        return max;

    }
    public static void main(String[] args){

        String s = "pwwkew";
        System.out.println(findLongest(s));

    }
}
