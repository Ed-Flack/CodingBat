public String deFront(String str) {
  StringBuilder sb = new StringBuilder();
  if (str.length() >= 1 && str.charAt(0) == 'a') {
    sb.append('a');
  }
  if (str.length() >= 2 && str.charAt(1) == 'b') {
    sb.append('b');
  }
  return str.length() == 0 ? "" : sb.toString() + str.substring(2);
}
