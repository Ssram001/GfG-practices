class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
         int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        
        for(int i =0; i<arr.length; i++){
            if(arr[i]> max){
                secmax = max;
                max = arr[i];
            }
            else if (arr[i]>secmax && arr[i]!=max){
                secmax = arr[i];
            }
             
        }
        if(secmax == Integer.MIN_VALUE) return -1;
    
        return secmax;
       
    }
}