import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int left = 0;
        int right = 0;
        int maxLength = 0;
        Set<Character> uniqueChars = new HashSet<>();

        while (right < s.length()) {
            if (!uniqueChars.contains(s.charAt(right))) {
                uniqueChars.add(s.charAt(right));
                maxLength = Math.max(maxLength, uniqueChars.size());
                right++;
            } else {
                uniqueChars.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s1));

        String s2 = "bbbbb";
        System.out.println("Input: " + s2);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s2));

        String s3 = "pwwkew";
        System.out.println("Input: " + s3);
        System.out.println("Output: " + solution.lengthOfLongestSubstring(s3));
    }
}