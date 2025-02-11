class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int i = 1;
        int j = arr.size()-2;
        int m;
        while (i <= j){
            m = i + (j-i)/2;

            if (arr[m]> arr[m-1] && arr[m] > arr[m+1]){
                return m;
            } else if (arr[m] > arr[m-1]){
                i = m+1;
            } else {
                j = m-1;
            }
        }
        return -1;
        
    }
};