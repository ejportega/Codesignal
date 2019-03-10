int[] sortByHeight(int[] a) {
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j] && a[j] != -1) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    return a;
}
