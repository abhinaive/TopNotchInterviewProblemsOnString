

public class LongestPalindromicSubstring{


     public static String longestPalindromicSubstringPresentInsideGivenString(String str){

         int leftPtr = 0, rightPtr = 0;

         if(str.length() == 0 || str == null)
            return "";

         for(int i = 0; i < str.length(); i++){

            int length1 = checkPalindrome(str,i,i);    // Consider this to be odd substring so 'i' is middle element & current position
            int length2 = checkPalindrome(str,i,i+1);  // Consider this to be odd substring so 'i' is middle element & 'i+1' next Element
            int maxLenOfPalindromFoundSoFar = Math.max(length1,length2);

            if( maxLenOfPalindromFoundSoFar > (rightPtr - leftPtr) ){
               
                 leftPtr = i - (maxLenOfPalindromFoundSoFar - 1)/2;
                 rightPtr = i + maxLenOfPalindromFoundSoFar/2;
            }

         }   

         return str.substring(leftPtr+1,rightPtr);   

     }

     public static int checkPalindrome(String str, int leftPtr, int rightPtr){

        while(leftPtr >=0 && rightPtr <str.length() && str.charAt(leftPtr) == str.charAt(rightPtr)){
             leftPtr--;
             rightPtr++;
        }

        return rightPtr - leftPtr + 1;
     }
   
     public static void main(String [] args){

          String str = "xymadakzy";

          System.out.println(longestPalindromicSubstringPresentInsideGivenString(str));
         
     }

}