int commonCharacterCount(String s1, String s2) {
    int commonChar = 0;
    for (int i = 0; i < s1.length(); i++) {
        for (int j = 0; j < s2.length(); j++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                commonChar++;
                s2  = s2.substring(0, j) + s2.substring(j+1);
                break;
            }
        }
    }
    return commonChar;
}
