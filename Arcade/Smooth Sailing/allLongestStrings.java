List<String> allLongestStrings(String[] inputArray) {
    List<String> longestStrings = new ArrayList();
    
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < inputArray.length; i++) {
        if (max < inputArray[i].length()) {
            max = inputArray[i].length();
            longestStrings.clear();
        }
        
        if (max == inputArray[i].length()) longestStrings.add(inputArray[i]);
    }
    
    return longestStrings;
}
