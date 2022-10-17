public int[] rotateLeft3(int[] nums) {
  int temp = nums[2];
  nums[2] = nums[0];
  nums[0] = nums[1];
  nums[1] = temp;
  return nums;
}
