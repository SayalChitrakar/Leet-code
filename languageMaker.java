import java.util.Arrays;

public class languageMaker {
    public static String converter(String input){
        String newString = "";
        String punctWord = "";
        int i,j;
        int punctCount = 0;
        String[] myArr = input.split(" ");

        for(i=0;i<myArr.length;i++){
            for(j=myArr[i].length()-1;j>0;j--){
                //Identifying the number of punctuation word.
                if(myArr[i].charAt(j)=='.' || myArr[i].charAt(j)==',' || myArr[i].charAt(j)==':' || myArr[i].charAt(j)==';' || myArr[i].charAt(j)=='?' || myArr[i].charAt(j)=='!'){
                    punctCount+=1;
                    punctWord+=myArr[i].charAt(j);
                }
                else{
                    break;
                }
            }
            newString+= myArr[i].substring(1,myArr[i].length()-punctCount) + myArr[i].charAt(0) + "arg"+punctWord+" ";
            punctWord = "";
            punctCount = 0;
        }

        return newString;

    }
    public static void main(String[] args){

        System.out.println(converter("Take what you can, give nothing back"));

    }
}
