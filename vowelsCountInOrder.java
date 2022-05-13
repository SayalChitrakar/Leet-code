import java.util.*;

public class vowelsCountInOrder {

    public static String logic(String input){

        TreeMap<Character,Integer> vowels =  new TreeMap<Character,Integer>();

        for(char ch:"aeiou".toCharArray()){
            vowels.put(ch,0);
        }

        String newString ="";
        String lowCaseString = input.toLowerCase();

        for(int i=0;i<lowCaseString.length();i++) {
            if(vowels.containsKey(lowCaseString.charAt(i))){
                vowels.put(lowCaseString.charAt(i),vowels.get(lowCaseString.charAt(i))+1);
            }
        }

        for(Map.Entry<Character,Integer> entry :vowels.entrySet()){
            if(entry.getValue()>0){
                newString+=""+entry.getValue()+entry.getKey();
            }
        }


        return newString;

    }

    public static void main(String[] args){

        String input = "Hello world, SEE this";
        System.out.println(logic(input));

    }

}

