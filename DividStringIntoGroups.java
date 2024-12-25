

public class DivideStringIntoGroups{


    public static String [] divideStringInGroupsOfSizeKWithFillers(String s, int sizeOfEachGroup){

         int noOfGroupsToForm = (s.length()%sizeOfEachGroup == 0) ? s.length()/k : s.length()/k + 1;
         char fill = 'x';

         String [] result = new String[noOfGroupsToForm];

         int idxOfGroup = 0;
         int i = 0;
         int j = 0;

         String substr = "";

         for(; i < s.length() ; ){

             while(j < k){
                substr += s.charAt(i);
                j++;
                i++;
             }

             while(substr.length() < k){
                 substr = substr + fill;
             }
 
             result[idxOfGroup] = substr;

             j = 0;

             substr = "";

             idxOfGroup++;
         }

         return result;
    }

    public static void main(String [] args){

         String str = "abcdefghij";
         int k = 3;

         String [] groupOfString = DividStringIntoGroups.divideStringInGroupsOfSizeKWithFillers(str,k);

         for(String s : groupOfString){
             System.out.println(s);
         }    

    }
}