public String withoutX2(String str) {
  StringBuilder sb = new StringBuilder();
  if (str.length() >= 1 && str.charAt(0) != 'x') {
    sb.append(str.charAt(0));
  }
  if (str.length() >= 2) {
    if (str.charAt(1) != 'x') {
      sb.append(str.charAt(1));
    }
    sb.append(str.substring(2));
  }
  return sb.toString();
}
