

public class LongestRepeatingCharacterReplacement{

  //Formula : (Substring Length) - (Count of Most Occurred char in that substring) <= (Count of Characters allowed for replacement).
  //Solution: Variable Size Sliding Window + Two Pointer
     
    public static int findSubstringOfMaxLengthThatCanBeFormedByReplacingKCharacters(String str, int maxNumOfReplacementPermitted ){
          
        int leftPtr = 0;
        
        int [] noOfOccurrencesInAlpabetArr = new int [26];
        int maxOccurranceOfAnyChar = 0;
        int maxLenOfSubstringFormed = 0;

        for(int rightPtr = 0; rightPtr < str.length(); rightPtr++){
 
            noOfOccurrencesInAlpabetArr[str.charAt(rightPtr) - 'A']++;
            maxOccurranceOfAnyChar = Math.max(maxOccurranceOfAnyChar,noOfOccurrencesInAlpabetArr[str.charAt(rightPtr) - 'A']);

            if( (rightPtr - leftPtr + 1) - maxOccurranceOfAnyChar > maxNumOfReplacementPermitted){
                
                noOfOccurrencesInAlpabetArr[str.charAt(leftPtr) - 'A']--;
                leftPtr++;
            }

            maxLenOfSubstringFormed = Math.max(maxLenOfSubstringFormed,rightPtr - leftPtr + 1);
        }

        return maxLenOfSubstringFormed;
    }

    public static void main(String [] args){

        String str = "ABAB";
        int maxNumOfReplacementPermitted = 2;

        System.out.println(findSubstringOfMaxLengthThatCanBeFormedByReplacingKCharacters(str,maxNumOfReplacementPermitted));

    }
}