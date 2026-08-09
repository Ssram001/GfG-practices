class Solution {
     static int count;
    public int inversionCount(int arr[]) {
        // code here
         count =0;
        int n = arr.length;
        
        //TLE ERROR BY BRUTE FORCE
        
        // for (int i = 0; i < n - 1; i++) {
        //     for (int j = i + 1; j < n; j++) {

        //         if (arr[i] > arr[j]) {
        //             count++;
        //         }
        //     }
        // }
        
        
        
        
        mergesort(arr);
        
        

        return count;
    }
    private static void mergesort(int[] arr) {
        int n = arr.length;
        if (n== 1) return;

        int[] a= new int[n/2];
        int[] b=new int[n-n/2];

        
        int idx =0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=arr[idx++];
        }
        for(int i=0;i<b.length;i++)
        {
            b[i]=arr[idx++];
        }

        mergesort(a);
        mergesort(b);

        
        merge(a,b,arr);
    }
    private static void merge(int [] a, int [] b, int [] c) {
        int i=0, j =0, k=0;


        while(i<a.length && j<b.length){ 
            if(a[i]<=b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }
            else{
                count += (a.length-i);
                c[k]=b[j];
                j++;
                k++;

            }
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
       