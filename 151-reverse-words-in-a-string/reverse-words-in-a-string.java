class Solution {
    public String reverseWords(String s) {
     s = s.trim(); 
     String token = "";
     String r = "";
     int d = 0;


     while (s.length()!=0){
        d = s.lastIndexOf(" ");
        token += " "+ s.substring(d+1, s.length());
        s = s.substring(0, d+1);
        s = s.trim();
        

     }
      token = token.trim();
     return token;
        
    }
    
}
        
