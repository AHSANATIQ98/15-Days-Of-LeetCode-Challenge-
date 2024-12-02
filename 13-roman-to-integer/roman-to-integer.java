class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int number = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                sum = 1;
            } else if (s.charAt(i) == 'V') {
                sum = 5;
            } else if (s.charAt(i) == 'X') {
                sum = 10;
            } else if (s.charAt(i) == 'L') {
                sum = 50;
            } else if (s.charAt(i) == 'C') {
                sum = 100;
            } else if (s.charAt(i) == 'D') {
                sum = 500;
            } else if (s.charAt(i) == 'M') {
                sum = 1000;
            }

            if (sum < prev) {
                number -= sum;
            } else {
                number += sum;
            }

            prev = sum;
        }

        return number;
    }
}
