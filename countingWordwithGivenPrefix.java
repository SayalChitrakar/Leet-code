public class countingWordwithGivenPrefix {

    public static int countVowels(String[] words,String pref){
        int i;
        int count = 0;
        for(i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){

        String[] word = {"pay","attention","practice","attend"};
        String pref = "at";
        System.out.println(countVowels(word,pref));
    }
}
