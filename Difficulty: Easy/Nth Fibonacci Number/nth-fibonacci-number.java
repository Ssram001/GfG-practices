class Solution {
    // public static int fibo(int x){
    //     return  fibo(x-1)+fibo(x-2);
    // }
    
    static int nthFibonacci(int n) {
        // code here
        if (n==0 || n==1) return n;
        
        
        return nthFibonacci( n-1)+nthFibonacci( n-2);
    }
}