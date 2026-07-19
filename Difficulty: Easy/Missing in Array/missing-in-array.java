class Solution {
    int missingNum(int arr[]) {
        // code here
        long n = arr.length;
        long sum2=(n+1)*(n+2)/2;
        long sum=0;
        
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        
        
        return (int)(sum2-sum);
    }
}