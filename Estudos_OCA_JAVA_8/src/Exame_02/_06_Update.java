package Exame_02;

public class _06_Update {

	private static void _06_Update(int[] nums, int index) {
		index++;
		nums[index] = 14;
	}
	public static void main(String[] args) {
		int index = 2;
		int[] nums = {1,3,5,7};
		_06_Update(nums, index);
		for(int n: nums) {
			System.out.print(n +",");
		}
		System.out.print(index);
	}

}
