public boolean unlucky1(int[] nums) {
  if (nums.length >= 2) {
    return nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3 || 
    nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3;
  }
  if (nums.length >= 3) {
    return nums[nums.length - 3] == 1 && nums[nums.length - 2] == 3;
  }
  return false;
}
