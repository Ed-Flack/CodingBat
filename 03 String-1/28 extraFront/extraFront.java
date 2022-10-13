public String extraFront(String str) {
  String out = str.substring(0, (str.length() >= 2 ? 2 : str.length()));
  return out + out + out;
}
