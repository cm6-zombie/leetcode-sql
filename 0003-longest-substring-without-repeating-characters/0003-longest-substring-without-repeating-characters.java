class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charmap = new HashMap<>();
        int left = 0;
        int max_length = 0;

        for(int right=0; right<s.length(); right++){
            char curr_char = s.charAt(right);
             if (charmap.containsKey(curr_char) && charmap.get(curr_char) >= left) {
                left = charmap.get(curr_char) + 1;
            }
            
            charmap.put(curr_char, right);
            
            max_length = Math.max(max_length, right - left + 1);
        }
        
        return max_length;
    }
}