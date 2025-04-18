#include <vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans(n, 1);
        
        // Compute left product for each index
        int left_product = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = left_product;
            left_product *= nums[i];
        }

        // Compute right product and multiply with left
        int right_product = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] *= right_product;
            right_product *= nums[i];
        }

        return ans;
    }
};
