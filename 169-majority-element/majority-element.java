class Solution {
    public int majorityElement(int[] nums) {
        int prevkami = 0;  // To store the majority element
        int prevkamiCount = 0;  // To store the count of majority element
        
        for (int i = 0; i < nums.length; i++) {
            int kami = 0;  // Reset for each element in the outer loop
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    kami++;  // Count the occurrences of nums[i]
                }
            }
            
            if (kami > prevkamiCount) {
                prevkamiCount = kami;  // Update the count if the current element is more frequent
                prevkami = nums[i];  // Update the majority element
            }
            
            // If we've found an element whose count exceeds half of the length, return it
            if (prevkamiCount > nums.length / 2) {
                return prevkami;
            }
        }
        
        return prevkami;  // Return the majority element (though by problem statement, it should always be found)
    }
}
