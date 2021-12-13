package day1;

import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

public class MajorityElement {
	
	@Test
	public void testCase1() {
		int [] nums = {2,2,1,1,1,2,2, 1,1,1,1};
		MajorityElements(nums);
	}
	
	@Test
	public void testCase2() {
		
	}
	
	private int MajorityElements(int[] nums) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();//Creating HashMap 
		for(int i=0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			} else {
				map.put(nums[i], 1);
			}
		}
		
		
		int maxValue = 0;
		int mKey = 0;
		for(Integer key: map.keySet()){
		    if(map.get(key) > maxValue){
		        maxValue = map.get(key);
		        mKey = key;
		    }
		}
		
		return mKey;
		
	}
	
	

}
