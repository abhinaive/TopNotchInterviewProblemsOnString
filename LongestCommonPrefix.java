
public class LongestCommonPrefix{

    /*

    1.  Assume that Longest common prefix can be the either the subset of first
        string or the entire set i.e. (eat in given example) in a given array of strings.
        for example  : eat, eater, eaten, eatables, eating.

    2.  indexOf(String str)
        Returns the index of the first occurrence of the substring str in the string. 
        If the substring is not found, it returns -1.
        int index = str.indexOf("World");
    */

    public static String findLongestCommonPrefixAmongArrayOfStrings(String [] strs){

        if(strs == null || strs.length == 0)
           return "";   

        String prefix = strs[0]; // Let the first string have the longest prefix in the array.

        for(int i = 1; i < strs.length; i++){  // {"eatable","eating","eater","eaten","eatary"};

            while(strs[i].indexOf(prefix) != 0){  // Means starting index of common prefix should be 0
            
              // creates a new string starting from index 0 up to (but not including) index [prefix.length() - 1]
                 prefix = prefix.substring(0,prefix.length() - 1); 

                 if(prefix.isEmpty())
                   return "";
            }
        }

        return prefix;     
    }

    public static void main(String [] args){

           String [] strs = {"eatable","eating","eater","eaten","eatary"};

           System.out.println(LongestCommonPrefix.findLongestCommonPrefixAmongArrayOfStrings(strs));  
    }
}