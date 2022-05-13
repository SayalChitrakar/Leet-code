public class mergeStringAlternatively {
    public static String  mergeAlternately(String word1, String word2){

        String mergeString = "";
        int i;
        for(i = 0;i<word1.length()|| i<word2.length();i++){

            if(i<word1.length()){
                mergeString+=word1.charAt(i);
            }
            if(i<word2.length()){
                mergeString+=word2.charAt(i);
            }
        }
        return mergeString;
    }
    public static void main(String[] args){

        String word1= "ab";
        String word2= "pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
}
