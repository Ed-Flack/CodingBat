public String frontTimes(String str, int n) {
  int len = str.length() >= 3 ? 3 : str.length();
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < n; i++) {
    sb.append(str.substring(0, len));
  }
  return sb.toString();
}
