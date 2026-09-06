// Last updated: 06/09/2026, 23:16:27
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        
4        int n = nums.length;
5        int[]positive = new int[n/2];
6        int[]negative = new int[n/2];
7
8        int p = 0;
9        int neg = 0;
10
11        for(int i=0; i<n; i++){
12            if(nums[i]>0){
13                positive[p++] = nums[i];
14            }
15            else {
16                negative[neg++] = nums[i];
17            }
18        }
19
20        for(int i=0; i<n/2; i++){
21            nums[i*2] = positive[i];
22            nums[i*2+1] = negative[i];
23        }
24
25        return nums;
26    }
27}