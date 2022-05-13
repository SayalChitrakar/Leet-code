public class maxlensentence {
    public static int mostWordsFound(String[] sentences){

        int i;
        int max= sentences[0].split("\\s+").length;
        for(i=1;i<sentences.length;i++){
            int len =sentences[i].split("\\s+").length ;
            if(len>max){
                max = len;
            }
        }
        return max;
    }
    public static void main(String[] args){
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }
}
