boolean areSimilar(int[] a, int[] b) {
  int c=0;
  for (int i=0; i<a.length; i++) {
    if (a[i]!=b[i]) c++;
  }
  Arrays.sort(a);
  Arrays.sort(b);
  if (!Arrays.equals(a,b)) return false;
  return c<=2;
}
