import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] f = new int[26];
        for (char c : word.toCharArray()) {
            f[c - 'a']++;
        }
        int res = 0;
        Arrays.sort(f);
        for (int i = 25; i >= 0; i--) {
            if (f[i] == 0) break;
            res += f[i] * (1 + ((25 - i) / 8));
        }
        return res;
    }
}