public class PrintAsciiValueOfCharactersInAString{



   public static void main(String [] args){

       String s = "Abhinav";

       for(int i = 0; i < s.length(); i++){
           char c = s.charAt(i);

           System.out.println("Soln 1 : " + c + " " + (int)c);
          
       } 

       System.out.println();

       for(int j = 0; j < s.length(); j++){
           
           char c = s.charAt(j);
           
           int ascii = c - 0;

           System.out.println("Soln 2 : " + c + " " + ascii);
       }         

   }

}