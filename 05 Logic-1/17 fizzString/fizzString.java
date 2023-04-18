public String fizzString(String str) {
  StringBuilder stringBuilder = new StringBuilder();
  if (str.charAt(0) == 'f') {
    stringBuilder.append("Fizz");
  }
  if (str.charAt(str.length() - 1) == 'b') {
    stringBuilder.append("Buzz");
  }
  return stringBuilder.length() > 0 ? stringBuilder.toString() : str;
}
