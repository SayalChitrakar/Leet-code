import java.util.HashMap;
import java.util.Map;

public class romanToInteger {

    public static void RomanToInteger(String roman) {
        int result = 0;
        int i,j;
        Map<Character, Integer> valueIndexing = new HashMap<>();

        valueIndexing.put('I', 1);
        valueIndexing.put('V', 5);
        valueIndexing.put('X', 10);
        valueIndexing.put('L', 50);
        valueIndexing.put('C', 100);
        valueIndexing.put('D', 500);

        int romanLength = roman.length();

        for(i=0;i<romanLength;i++){

            if(i>0 && valueIndexing.get(roman.charAt(i))> valueIndexing.get(roman.charAt(i-1))){

                result += valueIndexing.get(roman.charAt(i))-2* valueIndexing.get(roman.charAt(i-1)) ;
            }

            else{
                result += valueIndexing.get(roman.charAt(i));
            }
        }

        System.out.println(result);
    }




    public static void main(String[] args){

        RomanToInteger("XCIX");
    }
}

