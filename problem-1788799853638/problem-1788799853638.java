// Last updated: 07/09/2026, 22:20:53
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int n = nums.length;
5
6        // Step 1: Find the breakpoint
7        int i = n - 2;
8
9        while (i >= 0 && nums[i] >= nums[i + 1]) {
10            i--;
11        }
12
13        // Step 2: Find the next greater element
14        if (i >= 0) {
15            int j = n - 1;
16
17            while (nums[j] <= nums[i]) {
18                j--;
19            }
20
21            // Swap
22            swap(nums, i, j);
23        }
24
25        // Step 3: Reverse the remaining part
26        reverse(nums, i + 1, n - 1);
27    }
28
29    public void swap(int[] nums, int i, int j) {
30        int temp = nums[i];
31        nums[i] = nums[j];
32        nums[j] = temp;
33    }
34
35    public void reverse(int[] nums, int left, int right) {
36        while (left < right) {
37            swap(nums, left, right);
38            left++;
39            right--;
40        }
41    }
42}