int[] alternatingSums(int[] a) {
  int[] sums = new int[2];
  for (int i=0; i<a.length; i++) 
    sums[i%2]+=a[i];
  return sums;
}
