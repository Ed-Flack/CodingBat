public String altPairs(String str) {
  StringBuilder sb = new StringBuilder();
  for (int i = 0; i < str.length(); i++) {
    sb.append(str.charAt(i));
    if (i % 2 != 0) {
      i += 2;
    }
  }
  return sb.toString();
}
