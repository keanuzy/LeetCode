package 0003-Longest-Substring-Without-Repeating-Characters;

public class longest_substring_without_repeating_characters {
     public int lengthOfLongestSubstring(String s) {
        int a_pointer = 0;
        int b_pointer = 0;
        int output = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while (b_pointer < s.length()){
            if(!map.containsKey(s.charAt(b_pointer))){
                map.put(s.charAt(b_pointer), b_pointer);
                output = Math.max(map.size(), output);
                b_pointer++;
            }else{
                map.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return output;
    }
}
