class Solution {
    public void rotateMatrix(int[][] arr) {
        // code here
        
       int n = arr.length;
        int m = arr[0].length;
        
         for(int i=0;i<n;i++){
            int st=0,end=arr[0].length-1;
            while(st<end){
                int temp = arr[i][st];
                arr[i][st]=arr[i][end];
                arr[i][end]=temp;
                st++;
                end--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j< n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

       
    }
}
    
