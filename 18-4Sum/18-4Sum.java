// Last updated: 29/09/2026, 21:22:12
1class Solution {
2    public List<List<Integer>> fourSum(int[] nums, int target) {
3
4        int n = nums.length;
5        List<List<Integer>> ans = new ArrayList<>();
6
7        Arrays.sort(nums);
8
9        for (int i = 0; i < n - 3; i++) {
10            if (i > 0 && nums[i] == nums[i - 1]) {
11                continue;
12            }
13            for (int j = i + 1; j < n - 2; j++) {
14                if (j > i + 1 && nums[j] == nums[j - 1]) {
15                    continue;
16                }
17                int left = j + 1;
18                int right = n - 1;
19
20                while (left < right) {
21                    long sum = (long) nums[i] + nums[j]
22                             + nums[left] + nums[right];
23                    if (sum == target) {
24                        ans.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
25
26                        left++;
27                        right--;
28
29                        while (left < right && nums[left] == nums[left - 1]) {
30                            left++;
31                        }
32                        while (left < right && nums[right] == nums[right + 1]) {
33                            right--;
34                        }
35                    } else if (sum < target) {
36                        left++;
37                    } else {
38                        right--;
39                    }
40                }
41            }
42        }
43        return ans;
44    }
45}