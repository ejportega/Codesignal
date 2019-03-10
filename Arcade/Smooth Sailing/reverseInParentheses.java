String reverseInParentheses(String inputString) {
  while (inputString.indexOf('(') != -1) {
    int start = inputString.lastIndexOf('(');
    int end = inputString.indexOf(')', start);
    inputString = inputString.replace(inputString.substring(start, end+1), 
        new StringBuffer(inputString.substring(start+1, end)).reverse().toString());
  }
  return inputString;
}
