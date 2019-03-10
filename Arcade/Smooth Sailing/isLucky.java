boolean isLucky(int n) {
    String s = n+"";
    int len = s.length()/2;
    int sum = 0;
    
    for (int i = 0; i < s.length()/2; i++) {
        System.out.println(s.charAt(len-i-1)+" "+s.charAt(len+i));
        sum += s.charAt(len-i-1);
        sum -= s.charAt(len+i);
    }
    return sum == 0;
}
