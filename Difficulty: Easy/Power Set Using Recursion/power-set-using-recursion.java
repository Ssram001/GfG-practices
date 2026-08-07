class Solution {
     private void subsets(String ans, String s, int idx,ArrayList<String> list) {

        if (idx == s.length()) {
//            System.out.print(ans+" ");
            // if(ans.length()!=0) 
            list.add(ans);
            return;
        }

        char ch = s.charAt(idx);
        subsets(ans,s,idx+1,list);  // skip
        subsets(ans+ch,s,idx+1,list); // pick
        
    }
   
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> list = new ArrayList<>();
        subsets("",s,0,list);
        Collections.sort(list);
        return list;
    }
}
