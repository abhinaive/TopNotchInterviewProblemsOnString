import java.util.*;

public class ValidParenthesis{

    public static boolean checkIfGivenParenthesisIsValidOrNot(String str){

        Map<Character,Character> mappedBrackets = new HashMap<>();

        mappedBrackets.put(')','(');
        mappedBrackets.put('}','{');
        mappedBrackets.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);

            if(!mappedBrackets.containsKey(c)){  // Means these are opening brackets
                stack.push(c);
            }
            else{                                // Means we have closing bracket in hand 
                if(stack.empty()){
                    return false;
                }

                char topBracket = stack.pop();   // Top pe wahi hoga jo latest khula hoga

                if(topBracket != mappedBrackets.get(c)){  // string me current character agar latest opened bracket ka closing hai
                    return false;
                }
            }

        }

        if(stack.empty())    // Means Some Pair is not matching 
           return true;
        else
           return false;
    }

    public static void main(String [] args){

        String str = "[{()}]()[]";
        System.out.println(checkIfGivenParenthesisIsValidOrNot(str));

    }

}