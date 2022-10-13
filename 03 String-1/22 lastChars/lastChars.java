public String lastChars(String a, String b) {
  a = a.length() == 0 ? "@" : a;
  b = b.length() == 0 ? "@" : b;
  return "" + a.charAt(0) + b.charAt(b.length() - 1);
}
