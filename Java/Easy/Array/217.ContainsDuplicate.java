        import java.util.HashSet;

class Solution {


    public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> integerSet = new HashSet<>();

    for (int i=0; i<nums.length;i++){
     
            if(integerSet.contains(nums[i])){
                return true;
            
            
        }
        integerSet.add(nums[i]);

    }
    return false;



        
    }
}