/*
  Escape Sequence: The \\ is used to escape the / in the string literal, making it a valid regular.

  If the string contains consecutive slashes, the split() method will return empty strings between them 
  (e.g., "apple//banana" would result in {"apple", "", "banana"}).

*/

import java.util.*;

public class SimplifyPath{

    public static String buildSimplifiedPath(String str){

        Stack<String> stack  = new Stack<>();

        String [] pathElements =  str.split("\\/");

        for(String element : pathElements){

//          If the string contains consecutive slashes, the split() method will return empty strings between them 
            if(element.length() == 0 || element.equals(".")){  
               continue;
            }else if(element.equals("..")){  // Going one directory back, no need for the element
                if(!stack.empty()){
                    stack.pop();
                }
            }else{
                stack.push(element);
            }
        }

        String ans = "";

        while(!stack.empty()){
            ans = stack.pop() + "/" + ans;
        }

        if(ans.length() == 0)
           return "/";
        else
           return "/" + ans.substring(0, ans.length() - 1);  
    }

    public static void main(String [] args){

        String str = "/a/./b/..///c/";
        System.out.println(buildSimplifiedPath(str));  // -> /a/c

    }   
}
