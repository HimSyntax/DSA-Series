// Last updated: 15/08/2026, 03:08:12
1class Solution {
2    public boolean check(int[] nums) {
3
4       int count = 0;
5       int n = nums.length;
6
7        for(int i=0; i<nums.length; i++){
8            if(nums[i]>nums[(i+1)%n]){
9                count++;
10            }
11        }
12        return count<=1;
13    }
14}