

public class ValidAnagram{

    public static boolean checkIfGivenStringsAreAnagramsOfEachOtherOrNot(String s,String t){

        if(s.length() != t.length())
           return false;
        
    //  If an array is created but its elements are not initialized, the array elements are 
    //  assigned default values based on their type, similar to instance variables.

        int [] alphabetCountArr = new int [26];  
        
        for(int i = 0; i < s.length(); i++){
            alphabetCountArr[s.charAt(i) - 'a']++;
            alphabetCountArr[t.charAt(i) - 'a']--;
        }

        for(int count : alphabetCountArr){
            if(count != 0){
               return false;
            }
        }
        
        return true;
    }

    public static void main(String [] args){

        String s = "anagram";
        String t = "nagaram";

        System.out.println(checkIfGivenStringsAreAnagramsOfEachOtherOrNot(s,t));

    }

} 