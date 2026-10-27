public class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int[] charMap = new int[128];
        
        java.util.Arrays.fill(charMap, -1);
        
        int maxLen = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            
            if (charMap[currentChar] >= left) {
                left = charMap[currentChar] + 1;
            }
            
            
            charMap[currentChar] = right;
            
            
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
}
