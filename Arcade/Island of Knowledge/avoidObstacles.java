int avoidObstacles(int[] inputArray) {
  int minJump = 2;
  for (int i=0; i<inputArray.length; i++) {
    if (inputArray[i]%minJump == 0) {
      i = -1;
      minJump++;
    }
  }
  return minJump;
}
