public class validAngram {

    public static boolean isAngram(String s, String t){
        int i;
        int[] alpha = new int[26];
        for(i=0;i<s.length();i++){

            alpha[s.charAt(i)-'a']++;
            alpha[t.charAt(i)-'a']--;
        }

        for(int count:alpha){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s = "aacc";
        String t = "ccac";

        System.out.println(isAngram(s,t));
    }
}
