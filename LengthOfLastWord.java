public class LengthOfLastWord {

    public static int finder(String myString){

        int i,count=0;
        String myStringArr[] = myString.split("\\s");
        for(i=myStringArr.length-1;i>=0;i++){

            if(myStringArr!=null){
                return myStringArr[i].length();
            }
        }
        return myStringArr[i].length();
    }
    public static void main(String[] args){

        String myString = "   fly me   to   the moon  ";
        System.out.println(finder(myString));

    }
}
