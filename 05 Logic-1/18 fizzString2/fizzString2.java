public String fizzString2(int n) {
  StringBuilder stringBuilder = new StringBuilder();
  if (n % 3 == 0) {
    stringBuilder.append("Fizz");
  }
  if (n % 5 == 0) {
    stringBuilder.append("Buzz");
  }
  stringBuilder.append("!");
  return stringBuilder.length() > 1 ? stringBuilder.toString() : n + "!";
}
