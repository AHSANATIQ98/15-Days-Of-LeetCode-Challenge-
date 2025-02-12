class Solution {
public:
    int singleNonDuplicate(vector<int>& nums) {

        
        int low = 0;
        int high = nums.size()-1;
        int mid = -1;

        if (high == 0){
            return nums[high];
        }
        if (nums[0] != nums[1]){
            return nums[0];
        }
        if (nums[high] != nums[high-1]){
            return nums[high];
        }

        while (low <=high){
            int mid = low + (high-low)/2;
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid+1]){
                    low = mid +1;
                } else {
                    high = mid-1;
                }
            } else if (mid % 2== 1){
                if (nums[mid] == nums[mid-1]){
                    low = mid +1;
                } else {
                    high = mid-1;
                }
            }
        }
        return nums[low];
        
    }
};