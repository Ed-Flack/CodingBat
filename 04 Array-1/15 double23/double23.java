public boolean double23(int[] nums) {
  if (nums.length == 3) {
    return nums[0] == 2 && nums[1] == 2 || nums[1] == 2 && nums[2] == 2 || nums[0] == 3 && nums[1] == 3 || nums[1] == 3 && nums[2] == 3;
  } else if (nums.length == 2) {
    return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
  }
  return false;
}
