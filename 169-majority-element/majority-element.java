class Solution {
    public int majorityElement(int[] nums) {
        int freq = 0;  
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (freq == 0){
                n = nums[i]; 
            }
            if (nums[i] == n){
                freq++;
            } 
            if (nums[i] != n){
                freq--;
            }
            
        } 
        return n;
    }
}
