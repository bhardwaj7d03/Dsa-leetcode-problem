class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;

        // Count the number of 1's
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        StringBuilder ans = new StringBuilder();

        // Place all but one '1' at the front
        for (int i = 0; i < ones - 1; i++) {
            ans.append('1');
        }

        // Place all zeros
        for (int i = 0; i < s.length() - ones; i++) {
            ans.append('0');
        }

        // Place the last '1' at the end
        ans.append('1');

        return ans.toString();
    }
}