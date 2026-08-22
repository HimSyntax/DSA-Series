// Last updated: 23/08/2026, 01:19:18
1class Solution {
2    public int singleNumber(int[] nums) {
3        
4        int xor = 0;
5        for(int i=0; i<nums.length; i++){
6            xor = xor^nums[i];
7        }
8        return xor;
9    }
10}