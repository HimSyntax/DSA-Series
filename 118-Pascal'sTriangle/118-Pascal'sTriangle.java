// Last updated: 15/09/2026, 01:04:47
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        
4        List<List<Integer>> ans = new ArrayList<>();
5
6        for(int i=0; i<numRows; i++){
7            List<Integer> row = new ArrayList<>();
8            for(int j=0; j<=i; j++){
9                row.add(nCr(i,j));
10            }
11            ans.add(row);
12        }
13        return ans;
14    }
15
16        public int nCr( int r, int c){
17
18            int res = 1;
19
20            for(int i=0; i<c; i++){
21                res = res*(r-i);
22                res = res/(i+1);
23            }
24        return res;
25    }
26}