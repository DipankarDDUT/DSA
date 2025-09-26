


class Solution {
  public int mySqrt(int n) {

    if(n==0)  return 0;
    long low=1;
    long high=n; //cannot be more than that
    // we can use the concept of 
    // smaller number with largest as close as the sqaure root
    long result=1;
    while(low<=high){
        long mid=low+((high-low)/2);
        long mul=mid*mid;
        if((mul)==(long)n){
            return (int)mid;
        }else if(mul<(long)n){
            result=mid;  //potential resutl smaller close to the root
            low=mid+1;
        }else{
            high=mid-1;
        }
    }

    return (int)result;

  }
}
