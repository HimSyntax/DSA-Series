// Last updated: 15/09/2026, 16:04:31
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        
4        int n = nums.length;
5        int cnt = 0;
6
7        List<Integer>list = new ArrayList<>();
8
9        for(int i=0; i<n; i++){
10            if(list.contains(nums[i])){
11                continue;
12            }
13            cnt = 0;
14            for(int j=0; j<n; j++){
15                if(nums[j]==nums[i]){
16                    cnt++;
17                }
18            }
19            if(cnt>n/3){
20                list.add(nums[i]);
21            }
22        }
23        return list;
24    }
25}