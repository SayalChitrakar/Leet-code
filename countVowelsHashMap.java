import java.util.Map;
import java.util.TreeMap;

public class countVowelsHashMap {
    public static String check(String s){

        TreeMap<Character,Integer> map = new TreeMap<>();
        String newString = "";
        for(char ch:"aeiou".toCharArray()){
            map.put(ch,0);
        }
        String lowCaseString = s.toLowerCase();

        for(int i=0;i<lowCaseString.length();i++){

            if(map.containsKey(lowCaseString.charAt(i))){
                map.put(lowCaseString.charAt(i),map.get(lowCaseString.charAt(i))+1);
            }
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>0){
                newString+=""+entry.getValue()+entry.getKey();
            }

        }
        System.out.println(map);
        return newString;
    }
    public static void main(String[] args){

        String s = "A technology company";
        System.out.println(check(s));
    }
}
