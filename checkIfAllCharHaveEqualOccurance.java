public class checkIfAllCharHaveEqualOccurance {
    public static boolean logic(String s){

        int[] charOccr = new int[26];

        for(char ch: s.toCharArray()){

            charOccr[ch-97]++;

        }
        int max = charOccr[s.charAt(0)-97];
        for(int val:charOccr){

            if(val!=0 && val!=max){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args){

        String s = "vvvvvvvvvvvvvvvvvvv";
        System.out.println(logic(s));

    }
}
