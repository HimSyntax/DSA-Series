// Last updated: 25/07/2026, 22:41:13
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1 = 0;
4        int num2 = 0;
5
6        for (int i = 1; i <= n; i++) {
7            if (i % m == 0) {
8                num2 += i;
9            } else {
10                num1 += i;
11            }
12        }
13        return num1-num2;
14    }
15}