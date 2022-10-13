public String backAround(String str) {
  return !str.equals("") ? str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1) : "";
}
