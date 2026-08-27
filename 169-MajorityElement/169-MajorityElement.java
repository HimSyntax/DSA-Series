// Last updated: 27/08/2026, 22:28:12
1class Solution {
2    public int majorityElement(int[] nums) {
3        
4        int n = nums.length;
5
6        for(int i=0; i<n; i++){
7            int cnt = 0;
8            for(int j=0; j<n; j++){
9                if(nums[j]==nums[i]){
10                    cnt++;
11                }
12            }
13            if(cnt>n/2){
14                return nums[i];
15            }
16        }
17
18        return -1;
19    }
20}