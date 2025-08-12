class Solution {
    public double myPow(double x, int n) {
        
        long temp=n;
        if(n<0){
            x=1/x;
            temp=n* -1L;
            
        }
      return pow(x,temp);
    }

    public double pow(double x,long n){
        if(x==1.0||n==0){
            return 1;
        }
        if(n%2==0){
            x=x * x;
            n= n/2;
        }
        return x * pow(x,n-1);
    }
}