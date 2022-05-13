public class CleanTheFloor {

    public static String logic(String input){
        String newString = "";
        newString = input.replaceAll("[dustDUST]","");

        if(newString.equals(input)){
            return "it's clean floor";
        }
        return newString;
    }
    public static void main(String[] args){

        String input = "floor";
        System.out.println(logic(input));
    }
}
