class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> san=new HashSet<>();
        //int a=0;
        for(int i=0;i<nums.length;i++){
            if(!san.contains(nums[i])){
                san.add(nums[i]);
            }
            else{
               return true;
            }
        }
        
        return false;
    }
}