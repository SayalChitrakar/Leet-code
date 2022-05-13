public class removePalindromicSubsequence {

    public static int logic(String s){

        if(s.length()==0){
            return 0;
        }
        int beg = 0;
        int end = s.length()-1;
        while(beg<end){

            if(s.charAt(beg)==s.charAt(end)){
                beg++;
                end--;
            }
            else{
                return 2;
            }
        }

        return 1;

    }

    public static void main(String[] args){

        String s = "ababa";
        System.out.println(logic(s));
    }
}
