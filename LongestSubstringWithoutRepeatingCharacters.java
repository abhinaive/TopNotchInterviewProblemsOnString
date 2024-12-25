import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters{

    //Solution: Variable Size Sliding Window + Two Pointer

    public static int findLongestSubstringWithoutRepeatingCharacters(String str){

        if(str.length() == 0 || str == null){
           return 0;
        }

        if(str.length() == 1){
           return 1;
        }
        
        int leftPtr = 0;
        int rightPtr = 0;
        int SubsWithNoRepCharLen = 0;

        HashSet <Character> set = new HashSet<>();

        while(rightPtr < str.length()){

              char c = str.charAt(rightPtr);

              while(set.contains(c)){
                 set.remove(str.charAt(leftPtr));
                 leftPtr++;
              }

              set.add(c);
              SubsWithNoRepCharLen = Math.max(SubsWithNoRepCharLen,rightPtr - leftPtr + 1);
              rightPtr++;
        }

        return SubsWithNoRepCharLen;
    }

    public static void main(String [] args){

        String str = "abcabckbb";
         
        System.out.println(findLongestSubstringWithoutRepeatingCharacters(str));
    }


}