
import java.awt.image.AreaAveragingScaleFilter;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class prac {

    public static void logic(String s){

        String newString = "";
        for(int i =1;i<s.length();i=i+2){
            if(s.charAt(i)>s.charAt(i-1)){
                newString+=s.charAt(i);
            }
            else{
                newString+=s.charAt(i-1);
            }
        }
        if(s.charAt(s.length())%10!= 0){

            newString+=s.charAt()
        }

    }
    public static void main(String[] args){

        String s = "578921445";
        logic(s);

    }

}


