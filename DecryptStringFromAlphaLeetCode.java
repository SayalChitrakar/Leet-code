import java.util.HashMap;

public class DecryptStringFromAlphaLeetCode {

    public static String logic(String s){
        String newString = "";
        for(int i=s.length()-1;i>=0;i--){

            if(s.charAt(i)=='#'){
                i=i-2;
                newString= (char)(96+Integer.parseInt(""+s.charAt(i)+s.charAt(i+1)))+newString;

            }
            else{
                newString=(char)(96+Character.getNumericValue(s.charAt(i)))+newString;
            }

        }
        return newString;
    }

    public static void main(String[] args){
        String s = "1326#";
        System.out.println(logic(s));

    }
}
