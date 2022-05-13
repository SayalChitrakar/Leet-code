import java.util.Stack;
import java.util.stream.Collectors;

public class removeAdjacentString {

    public static String removeDuplicates(String s){
        int i;
        boolean flag = false;
        Stack<Character> stack = new Stack<Character>();

        for(i=0;i<s.length();i++){

            if(!stack.empty()){
                if(stack.peek()==s.charAt(i)){
                    stack.pop();
                    flag = true;
                }
            }

            if(!flag){
                stack.push(s.charAt(i));
            }
            flag = false;

        }

        return stack.stream().map(a -> a.toString()).collect(Collectors.joining(""));

    }

    public static void main(String[] args){

        String s = "azxxzy";
        System.out.println(removeDuplicates(s));

    }
}
