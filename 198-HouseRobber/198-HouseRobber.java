// Last updated: 19/07/2026, 16:47:05
1class Solution {
2    public int rob(int[] nums) {
3        
4        int prev1 = 0;
5        int prev2 = 0;
6
7        for( int num : nums){
8            int curr = Math.max(prev1, prev2 + num);
9            prev2 = prev1;
10            prev1 = curr;
11        }
12        return prev1;
13    }
14}