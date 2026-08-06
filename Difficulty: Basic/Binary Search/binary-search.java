class Solution {
    
    
    public static boolean helper(int[] nums,int target, int lo,int hi){
        if(lo>hi) return false;
        int mid = lo+(hi-lo)/2;
        if(nums[mid]==target) return true;
        else if (nums[mid]>target) return helper(nums,target,lo,mid-1);
        else return helper(nums,target,mid+1,hi);
    }
    public boolean binarySearch(int[] nums, int target) {
        // code here
        //  int l=0, h=arr.length-1, idx = -1;
         
        // while(l<=h){
        //   int mid = (l+h)/2;
          
        //   if(arr[mid]>k){
        //     h=mid-1;
        //   }
        //   else if(arr[mid]<k){
        //     l=mid+1;
        //   }
        //   else{
        //     // idx =mid;
        //     // h = mid-1;
        //     return true;
        //   }
        // }
        // return false;
        
        
        
         int n = nums.length;
        return helper(nums,target, 0,n-1);
        
    }
       
    
}