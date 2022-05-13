import java.util.Arrays;

public class noOfLineToWriteString {
    public static int[] logic(int[] widths, String s){

        int[] result = new int[2];
        int line = 1;
        int count = 0;

        for(char ch: s.toCharArray()){

            int charLen= widths[ch-'a'];
            if(count+charLen>100){
                line++;
                count=0;
            }
            count += charLen;

        }
        result[0] = line;
        result[1] = count;
        return result;
    }
    public static void main(String[] args){


        int[] width ={4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(logic(width,s)));
    }
}
