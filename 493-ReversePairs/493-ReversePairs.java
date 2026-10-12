// Last updated: 12/10/2026, 23:29:36
1class Solution {
2
3    public int reversePairs(int[] nums) {
4        return mergeSort(nums, 0, nums.length - 1);
5    }
6
7    public int mergeSort(int[] nums, int low, int high) {
8
9        if (low >= high) {
10            return 0;
11        }
12
13        int mid = low + (high - low) / 2;
14
15        int cnt = mergeSort(nums, low, mid);
16        cnt += mergeSort(nums, mid + 1, high);
17        cnt += countPairs(nums, low, mid, high);
18
19        merge(nums, low, mid, high);
20
21        return cnt;
22    }
23
24    public int countPairs(int[] nums, int low, int mid, int high) {
25
26        int right = mid + 1;
27        int cnt = 0;
28
29        for (int i = low; i <= mid; i++) {
30
31            while (right <= high && nums[i] > 2L * nums[right]) {
32                right++;
33            }
34
35            cnt += right - (mid + 1);
36        }
37
38        return cnt;
39    }
40
41    public void merge(int[] nums, int low, int mid, int high) {
42
43        int[] temp = new int[high - low + 1];
44
45        int left = low;
46        int right = mid + 1;
47        int k = 0;
48
49        while (left <= mid && right <= high) {
50
51            if (nums[left] <= nums[right]) {
52                temp[k++] = nums[left++];
53            } else {
54                temp[k++] = nums[right++];
55            }
56        }
57
58        while (left <= mid) {
59            temp[k++] = nums[left++];
60        }
61
62        while (right <= high) {
63            temp[k++] = nums[right++];
64        }
65
66        for (int i = 0; i < temp.length; i++) {
67            nums[low + i] = temp[i];
68        }
69    }
70}