public int[] makeLast(int[] nums) {
  int[] doubleNums = new int[nums.length * 2];
  doubleNums[doubleNums.length - 1] = nums[nums.length - 1];
  return doubleNums;
}
