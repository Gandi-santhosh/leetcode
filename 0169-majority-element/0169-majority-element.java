import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int n = nums[i];

            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }

        for(int key : map.keySet()) {

            if(map.get(key) > nums.length / 2) {
                return key;
            }
        }

        return -1;
    }
}