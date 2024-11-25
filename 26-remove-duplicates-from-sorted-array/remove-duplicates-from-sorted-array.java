class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[k]){
                k++;
                nums[k] = nums[i];
            }
            System.out.println(k);
        }
        return k+1;
        
    }
    
}