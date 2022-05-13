public class happyCountTry {

    public static int reverser(String input){

        int happyCount = 0;
        if(input.length()>0){
            if(input.charAt(0)==input.charAt(1)){
                happyCount++;
            }
            if(input.charAt(input.length()-1)==input.charAt(input.length()-2)){
                happyCount++;
            }
        }
        for(int i=1;i<input.length()-1;i++){

            if(input.charAt(i-1)==input.charAt(i)&& input.charAt(i+1)==input.charAt(i)){
                happyCount++;
            }

        }
        return happyCount;


    }
    public static void main(String[] args){

        String input = "10001";
        System.out.println(reverser(input));
    }
}
