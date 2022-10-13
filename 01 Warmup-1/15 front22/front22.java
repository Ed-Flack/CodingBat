public String front22(String str) {
  String chars;
  if (str.length() >= 2) {
    chars = str.substring(0 , 2);
  } else {
    chars = str.substring(0 , str.length());
  }
  return chars + str + chars;
}
