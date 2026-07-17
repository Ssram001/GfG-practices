import java.util.ArrayList;

class Solution {
    ArrayList<Integer> find(int arr[], int k) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        // code here
            int l=0, h=arr.length-1, idx1 = -1, idx2=-1;
             
            while(l<=h){
              int mid = (l+h)/2;
              
              if(arr[mid]>k){
                h=mid-1;
              }
              else if(arr[mid]<k){
                l=mid+1;
              }
              else{
                idx1 =mid;
                h = mid-1;
              }
            }
          
            l=0; h=arr.length-1;
           
            while(l<=h){
              int mid = (l+h)/2;
              
              if(arr[mid]>k){
                h=mid-1;
              }
              else if(arr[mid]<k){
                l=mid+1;
              }
              else{
                idx2 =mid;
                l = mid+1;
              }
            }
            
            ans.add(idx1);
            ans.add(idx2);
            
            return ans;
            
            
        
        
        // ArrayList<Integer> ans = new ArrayList<>();
        
        // int l = 0, h = arr.length - 1;
        // int idx1 = -1, idx2 = -1;

        // // Find first occurrence
        // while (l <= h) {
        //     int mid = (l + h) / 2;

        //     if (arr[mid] > k) {
        //         h = mid - 1;
        //     } 
        //     else if (arr[mid] < k) {
        //         l = mid + 1;
        //     } 
        //     else {
        //         idx1 = mid;
        //         h = mid - 1;
        //     }
        // }

        // l = 0;
        // h = arr.length - 1;

        // // Find last occurrence
        // while (l <= h) {
        //     int mid = (l + h) / 2;

        //     if (arr[mid] > k) {
        //         h = mid - 1;
        //     } 
        //     else if (arr[mid] < k) {
        //         l = mid + 1;
        //     } 
        //     else {
        //         idx2 = mid;
        //         l = mid + 1;
        //     }
        // }

        // ans.add(idx1);
        // ans.add(idx2);

        // return ans;
       
    }
    
}
       
