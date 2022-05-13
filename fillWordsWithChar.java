import java.util.Arrays;

public class fillWordsWithChar {

    public static String detector(String input){

        String myArr[] = input.split(" ");
        int i,index=0,j;
        String myString = "";
        String longestString = myArr[0];
        String temp ="";
        //finding the charcter having maximum length
        for(i=1;i<myArr.length;i++){
            if(longestString.length()<myArr[i].length()){
                longestString = myArr[i];
            }
        }
        //adding the first character till it reaches the length of maximum string in a sentence.
        for(j=0;j<myArr.length;j++){
            for(i=0;i<longestString.length()- myArr[j].length();i++){
                temp+=myArr[j].charAt(0);
            }
            myString += myArr[j].charAt(0)+temp +myArr[j].substring(1)+" ";
            temp ="";

        }
        return myString;

    }

    public static void main(String[] args){

        String my_sentence = "i adore chitrakar adore";
        System.out.println(detector(my_sentence));

    }
}
