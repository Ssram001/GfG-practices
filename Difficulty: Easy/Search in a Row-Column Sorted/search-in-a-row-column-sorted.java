class Solution {
    public static boolean matSearch(int arr[][], int x) {
        // code here
        int n = arr.length, m = arr[0].length;
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(arr[i][j]==x) return true;
            }
        }
        return false;
    }
}