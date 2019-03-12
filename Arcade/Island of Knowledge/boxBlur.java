int[][] boxBlur(int[][] image) {
  int[][] box = new int[image.length-2][image[0].length-2];
  int sum = 0;
  for (int i=0; i < image.length-2; i++) {
    for (int j=0; j < image[0].length-2; j++) {
      sum += image[i][j];
      sum += image[i+1][j];
      sum += image[i+2][j];
        
      sum += image[i][j+1];
      sum += image[i+1][j+1];
      sum += image[i+2][j+1];

      sum += image[i][j+2];
      sum += image[i+1][j+2];
      sum += image[i+2][j+2];
        
      box[i][j] = (int) Math.floor(sum/9);
      sum = 0;
    }
  }
  return box;
}
