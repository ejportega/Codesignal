int[][] minesweeper(boolean[][] matrix) {
  int[][] minesweeper=new int[matrix.length][matrix[0].length];
  for (int i=0; i<matrix.length; i++) {
    for (int j=0; j<matrix[0].length; j++) {
      if (matrix[i][j]==true) {
        int flag=-1;
        while (flag < 7) {
          flag++;
          try {
            if (flag==0) minesweeper[i-1][j-1]++;
            if (flag==1) minesweeper[i-1][j]++;
            if (flag==2) minesweeper[i-1][j+1]++;
            if (flag==3) minesweeper[i][j-1]++;
            if (flag==4) minesweeper[i][j+1]++;
            if (flag==5) minesweeper[i+1][j-1]++;
            if (flag==6) minesweeper[i+1][j]++;
            if (flag==7) minesweeper[i+1][j+1]++;
          } catch(Exception e) { continue; }   
        }
      }
    }
  }
  return minesweeper;
}
