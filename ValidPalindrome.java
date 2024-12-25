


public class ValidPalindrome{

    public static boolean checkIfGivenSentenceIsPalindromeIgonringSpecialCharacters(String str){

        int leftPtr = 0;
        int rightPtr = str.length() - 1;

        while(leftPtr < rightPtr){

            while(leftPtr < rightPtr && !Character.isLetterOrDigit(str.charAt(leftPtr))){
                leftPtr++;
            }

            while(leftPtr < rightPtr && !Character.isLetterOrDigit(str.charAt(rightPtr))){
                rightPtr--;
            }

            if(Character.toLowerCase(str.charAt(leftPtr)) != Character.toLowerCase(str.charAt(rightPtr))){
                 return false;
            }

            leftPtr++;
            rightPtr--;
        }

        return true;
    }

    public static void main(String [] args){

        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkIfGivenSentenceIsPalindromeIgonringSpecialCharacters(str));

    }

}