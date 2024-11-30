class Solution {
    public void moveZeroes(int[] nums) {
        int i,j;
        if (nums.length >= 2){
            for (j = 0, i = 0 ;i< nums.length; i++){
                if (nums[i] != 0){
                    nums[j] = nums[i];
                    j++;
                } 
            }
            for (int k = j; k <= nums.length-1; k++){
                nums[k] = 0;
            }

        }
    }
}