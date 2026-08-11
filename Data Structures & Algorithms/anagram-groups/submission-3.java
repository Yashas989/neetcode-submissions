class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = Arrays.toString(charArr);
            if(map.containsKey(sortedStr)){
                List<String> temp = map.get(sortedStr);
                temp.add(str);
                map.put(sortedStr, temp);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(sortedStr, temp);
            }
        }

        List<List<String>> returnList = new ArrayList<>();
        for(String key : map.keySet()){
            returnList.add(map.get(key));
        }
        return returnList;
    }
}
