package code300BaiThieuNhi;

import java.util.HashMap;
import java.util.Map;

public class bai1_twoSum {

	
	
	public static void main(String[] args) {
		int nums[] = new int[]{2, 7, 11, 15};
		int target = 9;
		
		int result[] = twoSum(nums, target);
		
		System.out.print("Ket qua: ");
		for(int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int soCanTim = target - nums[i];
            if(hashmap.containsKey(soCanTim))
            	return new int[] {hashmap.get(soCanTim), i};
            hashmap.put(nums[i], i);
        }
        return new int[] {}; //trả về mảng rỗng nếu không tìm ra
    }
	
	

}
