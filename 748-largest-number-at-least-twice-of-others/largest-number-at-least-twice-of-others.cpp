class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int large = 0;
        int sec = 0;
        int index;
        for (int i = 0; i<nums.size(); i++){
            if (nums[i]>large){
                int temp = large;
                large = nums[i];
                index = i;
                sec = temp;
            } if (nums[i] < large && nums[i] > sec){
                sec = nums[i];
            }
        }
        if (large >= sec*2){
            return index;
        } else {
            return -1;

        }
        
    }
};