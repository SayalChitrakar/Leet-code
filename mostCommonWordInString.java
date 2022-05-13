import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mostCommonWordInString {
    public static String logic(String paragraph, String[] banned){

        if(paragraph=="")return "";

        String[] para = paragraph.toLowerCase().split("\\W+");
        HashMap<String,Integer> map = new HashMap<>();

        for(String word: para){
            if(!Arrays.asList(banned).contains(word)){
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }
                else{
                    map.put(word,1);
                }

            }
        }


        int maxValueinMap = Collections.max(map.values());
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()==maxValueinMap){
                return entry.getKey();

            }
        }


        return "";
    }
    public static void main(String[] args){

        String paragraph = "a.";
        String[] banned = {""};
        System.out.println(logic(paragraph,banned));
    }
}
