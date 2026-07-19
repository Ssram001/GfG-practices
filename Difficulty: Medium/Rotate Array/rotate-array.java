class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        int n=arr.length;
        int k=d%n;
        
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
        
    static void reverse(int []arr, int i,int j){
            while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
            }
        }
    
}