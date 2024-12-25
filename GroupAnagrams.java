import java.util.*;


public class GroupAnagrams{

    @SuppressWarnings("unchecked") 
    public static List<List<String>> groupAnagramsInListOfStrings(String [] strs){


         if(strs.length == 0)
            return new ArrayList<>();
         
         Map<String,List<String>> mapOfStringList = new HashMap<>();

         int [] hashArray = new int [26];

         for(String str : strs){
             
             Arrays.fill(hashArray,0);

             for(char c : str.toCharArray()){
                 hashArray[c - 'a']++;
             }

             StringBuilder sb = new StringBuilder();

             for(int i = 0; i < 26; i++){
                sb.append("#");         // append() method can accept various types of data, such as: int,float,char,string
                sb.append(hashArray[i]);    // append() method can accept various types of data, such as: int,float,char,string
             }

             String key = sb.toString();

             if(!mapOfStringList.containsKey(key)){
                mapOfStringList.put(key,new ArrayList());
             }

             mapOfStringList.get(key).add(str);     
         }
       //The values() method returns a Collection of the map's values, but the order of the 
       //values is determined by the type of Map (for example, HashMap, TreeMap, LinkedHashMap).
         return new ArrayList(mapOfStringList.values());

    }

    public static void main(String [] args){

        String [] strs = {"eat","ate","tea","nat","tab","bat"};

        List<List<String>> listOfAnagrams = groupAnagramsInListOfStrings(strs);

        for(List<String> stringList : listOfAnagrams){
            System.out.println(stringList);    
        }

    }

}