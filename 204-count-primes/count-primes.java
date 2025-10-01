class Solution {
    public int countPrimes(int n) {

        if (n <= 1) {
            return 0;
        }
        //Brute
        // int no_of_primes = 0;

        // for(int i=2;i<n;i++){
        //Better
        //You don’t need to test divisibility up to n−1.

        // You only need to test up to √n.
        // as √n. * √n. will give n so one of the divisor must be less than √n. thats why j goes from 2 to √n.
        //   O(n* n3/2)
        // for (int i = 2; i < n; i++) {
        //     boolean isPrime = true;
        //     // for each number i get sqrt and check j from 2 to sqrt(i)
        //     for (int j = 2; j <=Math.sqrt(i); j++) {
        //         if (i % j == 0) {
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime)
        //         no_of_primes++;
        // }

        // return no_of_primes;

        //Optimization on  O(n* n3/2)  root n we will try to do in O(1) 

        // Precomputation
        int no_of_primes = 0;
        // 0 based index from 0 to suppose n =30 then 0 to 29
        // we need 2 from 29
        // array is 0 to 29 
        boolean[] preComp = new boolean[n];
        // fill the array from2 to n-1 all 1
        for (int i = 2; i < n; i++) {
            preComp[i] = true;
        }

        // as said earlier one divisor must be smaller than root n so marking we doing here only so 
        for (int i = 2; i * i < n; i++) {
            if (preComp[i]) {
                // no make all 0
                for (int k = i * i; k < n; k += i)
                    preComp[k] = false;
            }

        }
        for (int i = 2; i < n; i++) {
            if (preComp[i]) {
                no_of_primes++;
            }
        }

        return no_of_primes;

    }

}