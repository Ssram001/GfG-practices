class Solution {
    int factorial(int n) {
        // code here
        //   if(n==0 ) { // or n==0 || n==1 then return 1
        //     return 1;
        // }
        // int fact= n*factorial(n-1);
        // return fact;
        
        int fact=1;
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
}
