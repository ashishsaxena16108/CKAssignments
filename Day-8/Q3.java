//Q3.Find the first Non Repeating Character
import java.util.*;

public class Q3{
    public static void main(String[] args){
         String s="ababcde";
         Map<Character,Integer> hm = new LinkedHashMap<>();
         for(char c : s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
         }
         for(Map.Entry<Character,Integer> e : hm.entrySet()){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                break;
            }
         }
    }
}