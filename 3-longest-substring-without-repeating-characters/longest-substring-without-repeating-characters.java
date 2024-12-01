class Solution {
    public int lengthOfLongestSubstring(String s) {
        int r = 0;
        int start = 0;
        
        for (int end = 0; end < s.length(); end++) {
            for (int j = start; j < end; j++) {
                if (s.charAt(j) == s.charAt(end)) {
                    start = j + 1;
                    break;
                }
            }
            r = Math.max(r, end - start + 1);
        }
        return r;
    }
}
