class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] Sarr = s.toCharArray();
        char[] Tarr = t.toCharArray();
        HashMap<Character, Integer> Smap = new HashMap<>();
        HashMap<Character, Integer> Tmap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Smap.put(Sarr[i], 1+ Smap.getOrDefault(Sarr[i], 0));
            Tmap.put(Tarr[i], 1+ Tmap.getOrDefault(Tarr[i], 0));
        }

        return Smap.equals(Tmap);
    }
}
