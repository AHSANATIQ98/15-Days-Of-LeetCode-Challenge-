class Solution {
    public boolean isPalindrome(String s) {
        Scanner input = new Scanner(System.in); 
        String alpha = "";
        for (int i = 0; i < s.length();i++){
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                alpha = alpha + s.charAt(i);
            } else if (s.length() == 1 ){
                System.out.println( s + "is an empty string or only have one chaaracter");
                return true;
            }
        }
        alpha = alpha.toLowerCase();
        System.out.println(alpha);
        int left = 0;
        int right = alpha.length()-1;
        while(right > left ){
            if (alpha.charAt(right) != alpha.charAt(left)){
                System.out.println(alpha + "is not palindrome");
                return false;
            } else {
                right--;
                left++;  
            }
        } 
        return true;  

    


        
    }
}