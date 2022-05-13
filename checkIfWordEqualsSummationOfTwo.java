public class checkIfWordEqualsSummationOfTwo {
    public static boolean isSumEqual(String firstWord,String secondWord, String targetWord){
        String longestWord;
        int firstNumber=0;
        int secondNumber=0;
        int targetNumber = 0;

        if(firstWord.length()>secondWord.length()&& firstWord.length()>targetWord.length()){
            longestWord = firstWord;
        }
        else if(secondWord.length()>firstWord.length()&& secondWord.length()>targetWord.length()){
            longestWord = secondWord;
        }
        else{
            longestWord = targetWord;
        }

        for(int i=0;i<longestWord.length();i++){

            if(i<firstWord.length()){

                firstNumber=firstNumber*10+((int)(firstWord.charAt(i)-'a'));
            }
            if(i<secondWord.length()){
                secondNumber=secondNumber*10+((int)(secondWord.charAt(i)-'a'));
            }
            if(i<targetWord.length()){
                targetNumber=targetNumber*10+((int)(targetWord.charAt(i)-'a'));
            }
        }
        return firstNumber + secondNumber == targetNumber;
    }
    public static void main(String[] args){

        String firstWord = "d";
        String secondWord = "b";
        String targetWord = "aaaaae";

        System.out.println(isSumEqual(firstWord,secondWord,targetWord));
    }

}
