public int greenTicket(int a, int b, int c) {
  return a != b && b != c && c != a ? 0 : a == b && b == c ? 20 : 10;
}
