public String withoutX(String str) {
  StringBuilder sb = new StringBuilder();
  if (str.length() >= 1 && str.charAt(0) != 'x') {
    sb.append(str.charAt(0));
  }
  if (str.length() >= 2) {
    sb.append(str.substring(1, str.length() - 1));
    if (str.charAt(str.length() - 1) != 'x') {
      sb.append(str.charAt(str.length() - 1));
    }
  }
  return sb.toString();
}
