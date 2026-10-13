// Last updated: 14/10/2026, 00:08:51
1class Solution {
2    public int maxProduct(int[] nums) {
3        
4        int n = nums.length;
5        int maxProduct = nums[0];
6
7        for(int i=0; i<n; i++){
8            int currentProduct = 1;
9
10            for(int j=i; j<n; j++){
11                currentProduct = currentProduct*nums[j];
12
13                if(currentProduct>maxProduct){
14                    maxProduct = currentProduct;
15                }
16            }
17        }
18        return maxProduct;
19    }
20}