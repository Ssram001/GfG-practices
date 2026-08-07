class Solution {
    private void subsets(String ans, String s, int idx,List<String> list) {

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
    public List<String> powerSet(String s) {
        // Code here
        List<String> list = new ArrayList<>();
        subsets("",s,0,list);
        Collections.sort(list);
        return list;
    }
}