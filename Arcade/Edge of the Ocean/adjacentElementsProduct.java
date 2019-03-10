int adjacentElementsProduct(int[] a) {
    int max = Integer.MIN_VALUE;
    for (int i = 1; i < a.length; i++) 
        max = Math.max(max, a[i-1] * a[i]);
    return max;
}
