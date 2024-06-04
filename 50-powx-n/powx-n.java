class Solution {
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        double ans=0;
      
         ans=myPow(x,n/2);
        
        //  ans=ans*ans;  // got the other half
        // check interger divis ion one lost 
        if(n%2==0){
            //even power
            ans=ans*ans;
        }else{
            //odd power
            if(n>0){
                //positive power
                ans=ans*ans*x;
                }else{
                    ans=(ans*ans)/x;
                }
        }
          
        
        System.out.println(ans);
       
        return ans;
    }
}