boolean checkPalindrome(String inputString) {
    return new StringBuffer(inputString).reverse().toString().equals(inputString); 
}
