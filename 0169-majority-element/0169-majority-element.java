class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> san=new HashMap<>();
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            san.put(temp,san.getOrDefault(temp,0)+1);

        }
       int ans=-1;
        for(int boom:san.keySet()){
            if(san.get(boom)>n){
                return boom;
            }
            
        }
        return -1;
    }
}