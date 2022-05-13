import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class convertToUpperCase {
    public static String convert(String value){
        String newString = "";
        int i;
        String leading = value.replaceAll("^(\\s+).+", "$1");;
        String tailing = value.replaceAll(".+?(\\s+)$", "$1");

        String TrimmedValue = value.trim();
        for(i=0;i<TrimmedValue.length();i++){

            if(!Character.isUpperCase(TrimmedValue.charAt(i)) && !Character.isWhitespace(TrimmedValue.charAt(i))){
                newString+= Character.toUpperCase(TrimmedValue.charAt(i));
            }
            else if(Character.isWhitespace(TrimmedValue.charAt(i))){
                newString+="*";
            }
            else{
                newString+= TrimmedValue.charAt(i);
            }

        }


       // System.out.println(newString);
        return leading + newString + tailing;

    }
    public static void main(String[] args){

        System.out.println(convert("                                hello my friend "));
    }
}
