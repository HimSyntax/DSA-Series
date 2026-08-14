// Last updated: 15/08/2026, 03:14:30
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        int i=0;
5        for(int j=1; j<nums.length; j++){
6            if(nums[j]!=nums[i]){
7                nums[i+1] = nums[j];
8                i++;
9            }
10        }
11        return (i+1);
12    }
13}