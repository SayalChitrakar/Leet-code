import java.util.ArrayList;
import java.util.List;

public class numberOfConsistentStrings {
    public static int logic(String allowed,String[] s){
        List<Character> allowArr = new ArrayList<>();

        int count = 0;
        for(char ch: allowed.toCharArray()){
            allowArr.add(ch);
        }

        for(int i=0;i<s.length;i++){
            boolean flag = true;
            for(int j =0;j<s[i].length();j++){
                if(!allowArr.contains(s[i].charAt(j))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String[] s = {"a","b","c","ab","ac","bc","abc"};
        String allowed = "abc";
        System.out.println(logic(allowed,s));
    }
}
