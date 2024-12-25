import java.util.*;

public class MinimumWindowSubstring{
  
  //Solution: Variable Size Sliding Window + Two Pointer
  //'t' is the string whose characters we have to find in 's' in min window

    public static String findMinWindowInWhichGivenStringCanExistInAnyOrder(String s, String t){

        if(s.length() == 0 || t.length() == 0 || s.length() < t.length()){
            return "";
        }

        Map<Character,Integer> mapT = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i),0) + 1);
        }

        int requiredNoOfChar = mapT.size();
        int FoundCharSoFarInSubstring = 0;
        int leftPtr = 0, rightPtr = 0;

        int [] trackerOfSubstringLengthAndPointers = {-1,0,0};  //   -1 = length, leftPtr = 0, rightPtr = 0

        Map<Character,Integer> substringMap = new HashMap<>();

        while(rightPtr < s.length()){
        
            char c = s.charAt(rightPtr);
            
            substringMap.put(c,substringMap.getOrDefault(c, 0) + 1);

            if(mapT.containsKey(c) && substringMap.get(c).intValue() == mapT.get(c).intValue()){
                FoundCharSoFarInSubstring++;
            }

            while(leftPtr <= rightPtr && requiredNoOfChar == FoundCharSoFarInSubstring){

                 if(trackerOfSubstringLengthAndPointers[0] == -1 || trackerOfSubstringLengthAndPointers[0] >= rightPtr - leftPtr + 1){
                    trackerOfSubstringLengthAndPointers[0] = rightPtr - leftPtr + 1;
                    trackerOfSubstringLengthAndPointers[1] = leftPtr;
                    trackerOfSubstringLengthAndPointers[2] = rightPtr;
                 }
                 
                 substringMap.put(s.charAt(leftPtr), substringMap.get(s.charAt(leftPtr)) - 1);

                 if(mapT.containsKey(s.charAt(leftPtr)) && substringMap.get(s.charAt(leftPtr)).intValue() < mapT.get(s.charAt(leftPtr)).intValue()){
                    FoundCharSoFarInSubstring--;
                 }

                 leftPtr++;

            }
            
            rightPtr++;
        }
 
        if(trackerOfSubstringLengthAndPointers[0] == -1)
           return "";
        else 
           return s.substring(trackerOfSubstringLengthAndPointers[1],trackerOfSubstringLengthAndPointers[2] + 1);
              
    }
    public static void main(String [] args){

        String s = "ABAXCBAC";
        String t = "ABC";

        System.out.println(findMinWindowInWhichGivenStringCanExistInAnyOrder(s,t));
    }

}
