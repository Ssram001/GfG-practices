class Solution {
    public static int hcf(int x, int y){
        if(y==0) return x;
        else return hcf(y,x%y);
    }
    
    public static int gcd(int a, int b) {
        // code here
        // int hcf =1;
        // int min = Math.min(a,b);
        // for(int i=1;i<=min;i++){
        //     if (a%i==0 && b%i==0){
        //         hcf =i;
        //     }
        // }
        // return hcf;   TLR=======WRONG APPROACH
        
        
        return hcf(a,b);
    }
}
