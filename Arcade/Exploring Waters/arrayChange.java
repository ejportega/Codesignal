int arrayChange(int[] inputArray) {
  int increase = 0;
  for (int i=0; i<inputArray.length-1; i++) {
    if (inputArray[i] >= inputArray[i+1]) {
      increase += (inputArray[i]+1) - inputArray[i+1];
      inputArray[i+1] = inputArray[i]+1; 
    }
  }
  return increase;
}
