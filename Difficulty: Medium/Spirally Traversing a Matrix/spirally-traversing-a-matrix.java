class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        // code here

        ArrayList<Integer> ans = new ArrayList<>();

        int n=arr.length, m=arr[0].length;

        int fr=0, fc=0, lr=n-1, lc=m-1;

        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++){
                 ans.add(arr[fr][j]);
            }
            fr++;
            if(fr>lr || fc>lc){
                break;
            }
            for(int j=fr;j<=lr;j++){
                ans.add(arr[j][lc]);
            }
            lc--;
            if(fr>lr || fc>lc){
                break;
            }
            for(int j=lc;j>=fc;j--){
                ans.add(arr[lr][j]);
            }
            lr--;
            if(fr>lr || fc>lc){
                break;
            }
            for(int j=lr;j>=fr;j--){
                ans.add(arr[j][fc]);
            }
            fc++;

        }
        return ans;
    }
}
