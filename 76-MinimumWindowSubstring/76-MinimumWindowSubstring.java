// Last updated: 31/05/2026, 22:29:31
1class Solution {
2    public String minWindow(String s, String t) {
3        if(s.length()< t.length())
4        return "";
5
6        int[] count = new int[128];
7        for(char c: t.toCharArray())
8        count[c]++;
9
10        int left = 0;
11        int start = 0;
12        int miLen = Integer.MAX_VALUE;
13        int required = t.length();
14
15        for(int right = 0; right<s.length(); right++){
16            char ch = s.charAt(right);
17
18            if(count[ch]>0)
19            required--;
20            count[ch]--;
21
22            while(required==0){
23                if(right-left+1<miLen){
24                    miLen = right-left+1;
25                    start = left;
26                }
27                char leftChar = s.charAt(left);
28                count[leftChar]++;
29                if(count[leftChar]>0)
30                required++;
31                left++;
32                }
33        }
34        return miLen == Integer.MAX_VALUE ? ""
35        : s.substring(start, start+miLen);
36    }
37}