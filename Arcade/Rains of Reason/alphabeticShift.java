String alphabeticShift(String inputString) {
  String ans = "";
  for (int i=0; i<inputString.length(); i++) {
    char c = inputString.charAt(i);
    ans += (++c < 123) ? c:'a';
  }
  return ans;
}
