int phoneCall(int min1, int min2_10, int min11, int cents) {
  if (cents < min1) return 0;
  
  for (int i = 1; i <= 9; i++) {
    if (cents < (min1 + min2_10 * i)) 
      return i;
  }
  
  return 10 + (cents - min1 - min2_10 * 9) / min11;
}
