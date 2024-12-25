
public class PrintThoseWordsContaingGivenLetter{

     public static void main(String [] args){

        String s = "A RED SEED SAY MY NAME";
        String m = s + " ";
        String w = "";

        for(int i = 0; i < m.length(); i++){

            char c = m.charAt(i);

            if(c != ' '){
                w = w + c;
            }else{

                if(w.contains("E")){
                    System.out.println(w);
                }

                w = "";
            }
        }

     }

}