boolean palindromeRearranging(String inputString) {
  Map<Character, Integer> map = new HashMap();
  for (int i = 0; i < inputString.length(); i++) {
    char c = inputString.charAt(i);
    map.put(c, map.get(c)==null ? 1:map.get(c)+1);
  }
  
  int cnt=0;
  for (Integer v:map.values()) 
    if (v%2!=0) cnt++;
  return cnt<=1;
}
