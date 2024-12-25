import java.util.*;

/*
   The appeal of a string is the number of distinct characters found in the string.

   Input: s = "abbca"
   Output: 28
   Explanation: The following are the substrings of "abbca":
-  Substrings of length 1: "a", "b", "b", "c", "a" have an appeal of 1, 1, 1, 1, and 1 respectively. The sum is 5.
-  Substrings of length 2: "ab", "bb", "bc", "ca" have an appeal of 2, 1, 2, and 2 respectively. The sum is 7.
-  Substrings of length 3: "abb", "bbc", "bca" have an appeal of 2, 2, and 3 respectively. The sum is 7.
-  Substrings of length 4: "abbc", "bbca" have an appeal of 3 and 3 respectively. The sum is 6.
-  Substrings of length 5: "abbca" has an appeal of 3. The sum is 3.
   The total sum is 5 + 7 + 7 + 6 + 3 = 28.
*/

public class TotalAppealOfAString{

    public static long appealSum(String s){

        long [] memoisationArr =  new long[s.length() + 1];

        int [] lastIndex = new int[26];

        Arrays.fill(lastIndex,-1);

        long sumOfAppeal = 0l;

        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i) - 'a';
            memoisationArr[i+1] = memoisationArr[i] + i - lastIndex[c];
            sumOfAppeal = sumOfAppeal + memoisationArr[i + 1];

            lastIndex[c] = i;
        }

        return sumOfAppeal;
    }

    public static void main(String [] args){
        String str = "abbca";
        System.out.println(appealSum(str));
    }

}
