class Solution {
     public void generate(int n, int l, int r,String s, ArrayList<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }

        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);

    }
   
    public ArrayList<String> generateParentheses(int n) {
        // code here
        int x=n/2;
        ArrayList<String> ans = new ArrayList<>();
        generate(x,0,0,"",ans);
        // System.out.println(ans);
        return ans;
        // return 
    }
}