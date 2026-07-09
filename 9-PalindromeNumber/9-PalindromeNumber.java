// Last updated: 10/07/2026, 01:27:04
1class Solution {
2    public boolean isPalindrome(int x) {
3        int dup = x;
4        int revNum = 0;
5
6        while (x > 0) {
7            int digit = x % 10;
8            revNum = revNum * 10 + digit;
9            x = x / 10;
10        }
11
12        return dup == revNum;
13    }
14}