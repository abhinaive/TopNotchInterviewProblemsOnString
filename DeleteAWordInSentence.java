

public class DeleteAWordInSentence{

    public static void main(String [] args){

         String s = "Silly Squirrels SWIFTLY Scampered Across The Sunny Street";
         String m = s + " "; 
         String w = "";
         String n = "";

         for(int i = 0; i < m.length(); i++){

             char c = m.charAt(i);

             if(c != ' '){
                w = w + c;
             }else{
                
                  if(w.equalsIgnoreCase("Swiftly")){
                    n = n + "";
                  }else{
                    n = n + w + " ";
                  }

                  w = "";
             }

         }
         
         System.out.println(n);
    }

}