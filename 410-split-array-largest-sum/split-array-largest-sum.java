class Solution {
    public int splitArray(int[] nums, int k) {
        int h= 0;
        for (int i = 0; i< nums.length;i++){
            h += nums[i];
        }

        

        int low = 0;
        int high = h;
        int mid;

        while (low <= high) {
            mid = low + (high - low) / 2; 

            if (isValid(nums, k, mid)) { 
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return low; 
    }

    public boolean isValid(int[] nums, int k, int mid) {
        int n = 1;
        int pages = 0;
        for (int i = 0; i < nums.length; i++) { 
            if (nums[i] > mid) {
                return false;
            }
            pages += nums[i];
            if (pages > mid) {
                n++;
                pages = nums[i];
            }
        }
        return n <= k; 
    }
}
