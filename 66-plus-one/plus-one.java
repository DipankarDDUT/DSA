class Solution {
    public int[] plusOne(int[] digits) {

        int carry=1;
        for(int i=digits.length-1;i>=0;i--){
            int num=digits[i]+carry;
            if(num>9){
                carry=1;
                num=num%10;
            }else{
                carry=0;
            }
            digits[i]=num;
        }

        if(carry<1){
            return digits;
        }

        int[] result=new int[digits.length+1];
        result[0]=1;

        for(int i=0;i<digits.length;i++){
            result[i+1]=digits[i];
        }

        return result;


    }
}