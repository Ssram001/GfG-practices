class Solution {
    public String countAndSay(int n) {
        // code here
        if(n==1) return "1";
        String s = countAndSay(n-1);// s ko padhna hai
        
         String ans = "";
        
        int i=0, j=0;
        int freq=0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
            
        }
        freq=j-i;
        ans+=freq;
        ans+=s.charAt(i);
        i=j;
        
       return ans;
        
        
    }
}
