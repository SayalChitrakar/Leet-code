public class reverseStringWords {
    public static String reverseWords(String s){

        String[] myString = s.split(" ");
        StringBuilder newString = new StringBuilder();

        for(String str : myString){
            StringBuilder newSB = new StringBuilder();
            newSB.append(str);
            newSB.reverse();

            newString.append(newSB+" ");
        }

        newString.setLength(newString.length()-1);

        return newString.toString();
    }
    public static void main(String[] args){

        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
