// Last updated: 10/07/2026, 01:15:29
1class Solution {
2    public int reverse(int x) {
3        long reverse = 0;
4
5        while( x != 0 ){
6            int digit = x%10;
7            reverse = reverse*10+digit;
8            x /= 10;
9        }
10        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
11            return 0;
12        }
13        return (int) reverse;
14    } 
15}
16