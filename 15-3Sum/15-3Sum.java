// Last updated: 21/09/2026, 07:28:36
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        
4        int n = nums.length;
5
6        Set<List<Integer>>ans = new HashSet<>();
7        
8        for(int i=0; i<n; i++){
9            HashSet<Integer>set = new HashSet<>();
10            for(int j=i+1; j<n; j++){
11                int third = -(nums[i]+nums[j]);
12
13
14                if(set.contains(third)){
15                    List<Integer>temp = Arrays.asList(nums[i],nums[j],third);
16                    Collections.sort(temp);
17                    ans.add(temp);
18                }
19                set.add(nums[j]);
20            }
21        }
22        return new ArrayList<>(ans);
23    }
24}