import java.util.Stack;

public class WinOrLossStack {

    public static String check(String s){

        Stack<Character> stack = new Stack<>();
        String newString ="";
        boolean flag =false;
        for(int i=0;i<s.length();i++)
        {
            if(!stack.empty() &&i%2!=0)
            {
                if(stack.peek()<=s.charAt(i))
                {
                    if(stack.peek()==s.charAt(i)){
                        flag = true;
                    }
                    stack.pop();
                }
                else{
                    flag =true;
                }
            }
            if(!flag)
            {
                stack.push(s.charAt(i));
            }
            flag=false;
        }

        if(stack.isEmpty()){
            return "total carnage";
        }
        for(char ch : stack){
            newString+=ch;
        }


        return newString;
    }

    public static void main(String[] args){

        String s= "12345";
        System.out.println(check(s));
    }

}
