import java.util.Arrays;

public public class Solution {
    public int minimumPushes(String word) {
        char[] chars = word.toCharArray();
        int[] freq = new int[26];
        for (int i = 0; i < chars.length; i++) {
            freq[chars[i] - 'a']++;
        }

        Arrays.sort(freq);
        int res = 0;
        int count = 0;
        for (int i = freq.length - 1; i >= 0; i--) {
            if(count < 8){
                res += freq[i];
            } else if (count < 16) {
                res+= freq[i] * 2;
            }else if(count < 24){
                res+= freq[i] * 3;
            }else{
                res += freq[i] * 4;
            }
            count++;
        }
        return res;
    }
}

