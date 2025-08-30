class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String s : strs){

            char[] arr= s.toCharArray();
            Arrays.sort(arr);
            String key= new String(arr);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String>> res = new HashMap<>();

        for(String s : strs){
            char [] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);
            res.putIfAbsent(sortedS, new ArrayList<>());
            res.get(sortedS).add(s);
        }
        return new ArrayList<>(res.values());
        
    }
}