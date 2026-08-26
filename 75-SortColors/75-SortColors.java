// Last updated: 26/08/2026, 22:16:20
1class Solution {
2    public void sortColors(int[] nums) {
3        
4        int cnt0 = 0;
5        int cnt1 = 0;
6        int cnt2 = 0;
7
8        for(int i=0; i<nums.length; i++){
9            if(nums[i]==0){
10                cnt0++;
11            }
12            else if(nums[i]==1){
13                cnt1++;
14            }
15            else{
16                cnt2++;
17            }
18        }
19
20        for(int i=0; i<cnt0; i++){
21            nums[i] = 0;
22        }
23        for(int i=cnt0; i<cnt0+cnt1; i++){
24            nums[i] = 1;
25        }
26        for(int i=cnt0+cnt1; i<nums.length; i++){
27            nums[i] = 2;
28        }
29    }
30}