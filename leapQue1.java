import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class leapQue1 {

    public static String logic(String input){

        String newString = "";
        String temp ="";
        List<Character> vowelChar = new ArrayList<>();
        for(char ch: "aeiouAEIOU".toCharArray()){
            vowelChar.add(ch);
        }

        for(String str:input.split(" ")){
            for(int i=0;i<str.length();i++){
                if(i>0){
                    if(str.charAt(i)!=str.charAt(i-1) || str.charAt(i)== str.charAt(i-1) && vowelChar.contains(str.charAt(i))){
                            temp+=str.charAt(i);
                        }
                }

            }
            newString+= str.charAt(0)+temp+" ";
            temp ="";
        }

        return newString;
    }
    public static void main(String[] args){

        String s = "Hello my fellow peeps";
        System.out.println(logic(s));

    }
}
