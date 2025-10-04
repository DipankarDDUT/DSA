class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        StringBuilder sb=new StringBuilder();
        // for 10 to 15 a b c d e f 
        // for mapping 
        char[] hexChars = "0123456789abcdef".toCharArray();

        while(num!=0 && sb.length()<8){
            int rem=num & 15; // getting the remainder as & with last 4 digit eill give
            // last 4 digits only thats how we will get the remainder 
            sb.append(hexChars[rem]);
            num=num>>>4; // right shift by 4 bits 
        }

        return sb.reverse().toString();
    }
}