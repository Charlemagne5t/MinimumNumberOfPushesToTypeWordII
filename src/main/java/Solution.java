import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];

        for(int i = 0; i < word.length(); i ++) {
            int ch = word.charAt(i) - 'a';
            freq[ch]++;
        }
        Arrays.sort(freq);
        int res = 0;
        int c = 8;
        int times = 1;
        for(int i = 25; i >= 0; i--) {
            res += freq[i] * times;
            c--;
            if(c == 0) {
                c = 8;
                times++;
            }
        }
        return res;
    }
}