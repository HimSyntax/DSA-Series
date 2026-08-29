// Last updated: 29/08/2026, 21:28:24
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int sum = 0;
5        int max = Integer.MIN_VALUE;
6
7        for (int i = 0; i < nums.length; i++) {
8            sum += nums[i];
9            max = Math.max(max, sum);
10
11            if (sum < 0) {
12                sum = 0;
13            }
14        }
15
16        return max;
17    }
18}