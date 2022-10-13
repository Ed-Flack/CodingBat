public int close10(int a, int b) {
  int aDiff = Math.abs(10 - a);
  int bDiff = Math.abs(10 - b);
  return aDiff == bDiff ? 0 : aDiff > bDiff ? b : a;
}
