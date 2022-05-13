import java.util.ArrayList;
import java.util.List;

public class goatLatin {

    public static String toGoatLatin(String sentence){

        String newString = "";
        List<Character> vowels = new ArrayList<>();
        for(char ch :"aeiouAEIOU".toCharArray()){
            vowels.add(ch);
        }
        int index =1;
        int i;
        for(String word :sentence.split("\\s")){
            char firstChar = word.charAt(0);

            if(vowels.contains(firstChar)){
                newString+=word+"ma";
            }
            else{
                newString+=word.substring(1)+firstChar+"ma";
            }
            for(i=0;i<index;i++){
                newString+='a';
            }
            if(index<sentence.split("\\s").length){
                newString+=" ";
            }


            index++;
        }

        return newString;
    }
    public static void main(String[] args){

        String sentence = "UXc J K";
        System.out.println(toGoatLatin(sentence));
    }
}
