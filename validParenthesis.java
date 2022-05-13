import java.util.Stack;

public class validParenthesis {


    public static boolean check(String s){

        Stack<Character> stack = new Stack<>();
        int i=0;
        char[] myArr = s.toCharArray();
        boolean status = false;
        for(char para :myArr){

            if(para == '(' || para == '{' || para == '['){

                stack.push(para);
            }
            else{
                if(stack.empty()){
                    return false;
                }
                else{
                    char top = stack.peek();

                    if( para ==')' && top =='(' || para == '}' && top =='{' || para == ']' && top == '['){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }
            }

            status = stack.empty();

        }

        System.out.println(stack);

    return status;

    }

    public static void main(String[] args){

        System.out.println(check("(){{}}"));
    }
}
