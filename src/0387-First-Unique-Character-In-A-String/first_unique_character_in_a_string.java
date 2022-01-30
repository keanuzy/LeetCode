package 0387-First-Unique-Character-In-A-String;

public class first_unique_character_in_a_string {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();
        int n = s.length();
        // Build a hash map: character and how often it appears;
        for(int i = 0; i < n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
        }
        
        // Find the index;
        for(int i = 0;i<n; i++){
            if(map.get(s.charAt(i)) == 1)
               return i;
        }
    
        return -1;
        
    }
}
