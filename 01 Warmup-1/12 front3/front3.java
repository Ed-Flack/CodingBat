public String front3(String str) {
  return str.length() >= 3 ? str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3) : str.substring(0, str.length()) + str.substring(0, str.length()) + str.substring(0, str.length());
}
