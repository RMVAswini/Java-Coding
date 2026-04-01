class Solution {
    public int divide(int dividend, int divisor) {
       if (dividend == Integer.MIN_VALUE && divisor == -1)
       {
        return Integer.MAX_VALUE;        
       }
       int quo = dividend / divisor;
       if (quo < 0) {
            return -Math.abs(quo);
       }
       else
        {
           return quo;
        } 
    }
}
