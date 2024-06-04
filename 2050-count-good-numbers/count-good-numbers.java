class Solution {
    long mod=1000000007;
    public int countGoodNumbers(long n) {
        // suppose n is 5 
        // even index even number odd prime number                         0 1 2 3 5   
        //even numbers from 0-9 is 0 2 4 6 8 and prime 2 3 5 7 possibilty  5 4 5 4 5
        // naive solution to traverse the whole and for even index ans * 5 mod 10 to ower 9 + 7 
        // issue here is n can be large 1 <= n <= 10 to the power 15
        // max 10 to the power 7 or else timed out 
        // to solve this we can find number of even places 5 to the power e no of even places  
        // 4 to the power o o is the total number of odd places 
        // then multiplication wil give the result 
        // n is 5 then odd is 3 and even is 2 wrong as it start from even 0 index
        // number of even index n/2 + n%2
        // number of odd index n/2
        // Answer ids 5 to power (n/2 + n%2) * 4 to the power n/2
        // issue here we can use pow in java problem being if exceed limit it will not work it will not take the modulo 10 to the power 9 +7
        // complexity is log base 2 y as dividing y by 2
        // to solve we can use recursion for power calculation 
        // like x raise to the y can be written as x raise to the power y/2 * x raise to the power y/2 when y is even 
        /// if y is odd then then separate one x from the x to the power y and subtract -1 from y
        // x raise to power 0 or 1 can be base case 

        // this below solution will work for very small input maybe less than 10

        // if(n==0){
        //     return 0;
        // }
        // long evenPossibilty=n/2 + n%2;
        // long oddPossibilty=n/2;
        // double evenAns=(double)Math.pow(5,evenPossibilty);
        // double oddAns=(double)Math.pow(4,oddPossibilty);
        // long modHold=(long)Math.pow(10,9)+7;
        // long answer=(evenAns%modHold)*(oddAns%modHold);

        // return (int)answer; 

        long even=n/2 + n%2;
        long odd=n/2;
        long answer=(power(5,even)*power(4,odd))%mod;

        return (int)answer;



    }
    public long power(long base,long power){
        if(power==0){
            // base case
             return 1;
        }    
        //keep on calling until base 0 
        long ans=power(base,power/2);
        // now suppose base got 0 then other number retract stack called
        // what even ans got halv power only requres full power 
        ans=(ans*ans)%mod;
        // suppose 1 was left integer division then another base need to be multiplied 
        if(power%2==1){
            // odd is there 
            ans=(ans*base)%mod;
        }
        return ans;
    }
}