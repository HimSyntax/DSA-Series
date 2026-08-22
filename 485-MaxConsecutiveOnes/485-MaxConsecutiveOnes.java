// Last updated: 23/08/2026, 00:39:14
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        
4        int max = 0;
5        int cnt = 0;
6
7        for(int i=0;  i<nums.length; i++){
8            if(nums[i]==1){
9                cnt++;
10
11                max = Math.max(max,cnt);
12            }
13            else{
14                cnt = 0;
15            }
16        }
17
18        return max;
19    }
20}