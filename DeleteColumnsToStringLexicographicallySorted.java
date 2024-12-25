
public class DeleteColumnsToStringLexicographicallySorted{

     public static int minDeletionCountToMakeArrayOfStringsLexicographicallySorted(String [] strArr){

//         strArr.length will give number of rows.
//         strArr[0].length() will give num of col/elem in first row.

           int deleteColCount = 0;

           for(int j = 0; j < strArr[0].length(); j++){

               for(int i = 0; i < strArr.length - 1; i++){
 
                   if(strArr[i].charAt(j) > strArr[i+1].charAt(j)){   // j = constant means same column me next row ka element
                       deleteColCount++;
                       break;
                   }

               }
           }

           return deleteColCount;
     }

     public static void main(String [] args){

           String [] strArr = {"abc","bce","cae"};
//         String [] strArr = {"abc","bce","cae"};

           System.out.println(minDeletionCountToMakeArrayOfStringsLexicographicallySorted(strArr));
     }
}