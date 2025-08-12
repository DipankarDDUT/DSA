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
            return pow(x,n);
        }
        // for odd is straightforward n-1 
        // for even how its working 
        // simple we have taken expont 2 from power and then put to base so x * x
        // so n /2 but next call whatever n was there that has to be get subtracted 
		     // by -1 
       return x * pow(x,n-1);
    }
}