import java.util.HashMap;

public class isomorphicString {
    public static boolean isIsomorphic(String s, String t){

        if(s.length()!=t.length()) {return false;}
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        int i;
        for(i=0;i<s.length();i++){

            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }

            }
            if(!map.containsKey(s.charAt(i))&&map.containsValue(t.charAt(i))){
                return false;
            }
            map.put(s.charAt(i),t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args){

        String s = "egk";
        String t = "add";
        System.out.println(isIsomorphic(s,t));

    }
}
