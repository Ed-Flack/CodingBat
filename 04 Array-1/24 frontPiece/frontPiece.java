public int[] frontPiece(int[] nums) {
  return nums.length >= 2 ? new int[]{nums[0], nums[1]} : nums.length != 0 ? new int[]{nums[0]} : new int[0];
}
