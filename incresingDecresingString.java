import java.util.Map;
import java.util.TreeMap;

public class incresingDecresingString {

    public static String logic(String s){

        TreeMap<Character,Integer> map = new TreeMap<>();

        for(char ch: s.toCharArray()){
            int count = map.getOrDefault(ch,0);
            map.put(ch,count+1);
        }
        System.out.println(map);

        String newString= "";
        String resultString = "";
        int totalString = s.length();

        while(totalString>0){

            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()>0){
                    newString+=entry.getKey();
                    map.put(entry.getKey(), entry.getValue()-1);
                    totalString--;
                }

            }
            resultString+=newString;
            newString ="";
            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()>0){
                    newString = entry.getKey()+newString;
                    map.put(entry.getKey(), entry.getValue()-1);
                    totalString--;
                }
            }

        }
        resultString+=newString;

        return resultString;
    }

    public static void main(String[] args){

        String s = "aaaabbbbcccc";
        System.out.println(logic(s));
    }

}
