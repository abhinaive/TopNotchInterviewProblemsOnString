
public class SmallestStringWithGIvenNumericValue{

/*
     a -> 1
          .
     b -> 1
          .
          .
     z -> 25  

     'a' + 'alphabet' = 26;
*/
     public static String findsmallestStringLexicographicallyWithAGivenNumericValueAsSum(int numOfCharInString, int sumOfChar){

        char [] resultingString = new char[numOfCharInString];

        int i = 0;

        while(i < numOfCharInString){  // fill resultingString array with 'a' initially.
            resultingString[i] = 'a';
            i++;
        }

        sumOfChar = sumOfChar - numOfCharInString;  // Since filled all places by 'a'.

        int j = numOfCharInString - 1;              // Start from last index

        while(sumOfChar > 0 && j >= 0){

            if(sumOfChar < 25){  // 25 because 'a' + 'otherchar' = 26
                resultingString[j] = (char)('a' + sumOfChar);
                sumOfChar = 0;   // sumOfChar is exhausted
            }else{
                resultingString[j]  = 'z';
                sumOfChar = sumOfChar - 25;  // Since 'a' was already there thus adding rest of maximum alphabet that we can.
            }

            j--;
        }

        StringBuilder sb = new StringBuilder();

        for(char c : resultingString){
           sb.append(c);
        }  

        return sb.toString();
     }

     public static void main(String [] args){

        int numOfCharInString = 5;
        int sumOfChar = 73;

        System.out.println(findsmallestStringLexicographicallyWithAGivenNumericValueAsSum(numOfCharInString,sumOfChar)); // aaszz

     }

}