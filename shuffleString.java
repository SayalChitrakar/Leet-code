import java.util.Map;
import java.util.TreeMap;

public class shuffleString {
    public static String logic(String s,int[] indices){
        char[] arrString = new char [s.length()];

        for(int i=0;i<s.length();i++){

            arrString[indices[i]] = s.charAt(i);
        }

        return String.valueOf(arrString);
    }
    public static void main(String[] args){

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(logic(s,indices));
    }
}
