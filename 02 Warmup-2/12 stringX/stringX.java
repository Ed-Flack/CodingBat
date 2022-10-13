public String stringX(String str) {
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) != 'x' || i == 0 || i == str.length() - 1) {
      sb.append(str.charAt(i));
    }
  }
  return sb.toString();
}
