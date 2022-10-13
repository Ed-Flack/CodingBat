public boolean stringE(String str) {
  int count = 0;
  for (char aChar : str.toCharArray()) {
    if (aChar == 'e') {
      count ++;
    }
  }
  return count >= 1 && count <= 3;
}
