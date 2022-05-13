import java.util.regex.*;
public class codingDecoding {

    public static void solving(String value){
        int i=0;
        int j;
        int counter=1;
        String newString = "";
        boolean flag = Pattern.compile(".*\\d+.*").matcher(value).matches();

        if(flag){

            for(i = 0;i<value.length();i++){

                if(Character.isDigit(value.charAt(i))){
                     for(j=0;j<value.charAt(i)-49;j++){
                         newString+= value.charAt(i+1);

                     }
                }
            }

        }
        else{
            char initial  = value.charAt(0);
            for(i=1;i<value.length();i++){

                if(value.charAt(i)==initial){
                    counter++;

                    if(i == value.length()-1){
                        counter+=1;
                        newString+=counter + Character.toString(initial);
                    }

                }
                else{

                    counter+=1;
                    newString+=counter + Character.toString(initial);
                    initial = value.charAt(i);
                    counter =1;
                }
            }
        }
        System.out.println(newString);
    }
    public static void main(String[] args){

        String ans = "9C";
        solving(ans);
    }
}
