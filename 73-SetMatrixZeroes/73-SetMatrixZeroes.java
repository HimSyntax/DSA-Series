// Last updated: 12/09/2026, 14:08:09
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean[] row = new boolean[m];
8        boolean[] col = new boolean[n];
9
10        // Find all rows and columns containing 0
11        for(int i = 0; i < m; i++) {
12            for(int j = 0; j < n; j++) {
13
14                if(matrix[i][j] == 0) {
15                    row[i] = true;
16                    col[j] = true;
17                }
18            }
19        }
20
21        // Set marked rows to 0
22        for(int i = 0; i < m; i++) {
23            if(row[i]) {
24                for(int j = 0; j < n; j++) {
25                    matrix[i][j] = 0;
26                }
27            }
28        }
29
30        // Set marked columns to 0
31        for(int j = 0; j < n; j++) {
32            if(col[j]) {
33                for(int i = 0; i < m; i++) {
34                    matrix[i][j] = 0;
35                }
36            }
37        }
38    }
39}