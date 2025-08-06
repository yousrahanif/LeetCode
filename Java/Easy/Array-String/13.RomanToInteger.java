import java.util.HashMap;
import java.util.Map;
class Solution {



    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
map.put('I', 1);
map.put('V', 5);
map.put('X', 10);
map.put('L', 50);
map.put('C', 100);
map.put('D', 500);
map.put('M', 1000);
        int romanValue=0;
        int n=s.length();
     
      int count=0;
      int total=0;
      while(count<n){
        int getFirst=map.get(s.charAt(count));
       
        if(count+1 < n && getFirst<map.get(s.charAt(count+1))){
             total+=map.get(s.charAt(count+1))-getFirst;
            count=count+2;
            

        }
        else{
           total+=getFirst;
            count=count+1;

        }

      }
      return total;
         
    }
}