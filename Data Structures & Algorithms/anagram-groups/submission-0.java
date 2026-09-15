class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> ga = new HashMap<>();
      for(String s:strs){
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String sorteds= new String(charArray);
        ga.putIfAbsent(sorteds,new ArrayList<>());
        ga.get(sorteds).add(s);
      }  
      return new ArrayList<>(ga.values());
    }
}
