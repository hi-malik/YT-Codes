package LeetCode;

class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toLowerCase();
        int n = s.length();
        int m = s.length() / 2;
        int a = 0, b = 0;
        for(int i = 0; i < m; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                a++;
            }
        }
        for(int i = m; i < n; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u'){
                b++;
            }
        }
        return a == b;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)

// Date :- 01/12/2022