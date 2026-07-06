class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
       int l=0,h=arr.length-1;
       
       while (l<=h){
           int mid = (l+h)/2;
           int correctidx=mid+1;
           int missing = arr[mid]-correctidx;
           
           if (missing>=k){
               h=mid-1;
           }
           else l=mid+1;
          
       }
        return l+k;
        // return h+1+k;
    }
}