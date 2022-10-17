public int[] front11(int[] a, int[] b) {
  if (a.length >= 1) {
    if (b.length >= 1) {
      return new int[]{a[0], b[0]};
    }
    return new int[]{a[0]};
  } 
  if (b.length >= 1) {
    return new int[]{b[0]};
  }
  return new int[]{};
}
