// Last updated: 21/07/2026, 22:38:27
1class Solution {
2    public void moveZeroes(int[] nums) {
3        
4        int count = 0;
5        for(int i=0; i<nums.length; i++){
6            if(nums[i]!=0){
7                nums[count] = nums[i];
8                count++;
9            }
10        }
11        while(count<nums.length){
12            nums[count] = 0;
13            count++;
14        }
15    }
16}