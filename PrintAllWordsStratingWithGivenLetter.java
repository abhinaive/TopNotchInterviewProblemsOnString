

public class PrintAllWordsStratingWithGivenLetter{

    public static void main(String [] args){

         String s = "Silly Squirrels Swiftly Scampered Across The Sunny Street";
         String m = s + " ";  // Added to be able to read last word
         String w = "";
         


         for(int i = 0; i < m.length(); i++){

             char c = m.charAt(i);

             if(c != ' '){
                 w = w + c;
             }else{
                     if(w.startsWith("S")){
                         System.out.println(w);

                     }

                     w = "";
             }

         }

    }

}