package com.java.gradereport;

public class Sort
{
	public float sumArray(float[] array)
	{
		float sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}
		return sum;
	}

	public static int switchThem(int[] array1, int[] array2)
	{
		int[] temp = new int[array1.length];
		temp = array1;
		array1 = array2;
		array2 = temp;
		return 0;
	}
	public static boolean hasDuplicate(int[] nums) {
		for(int i =0;i < nums.length-1; i++) {
			if(nums[i] == nums[i+1])
				return true;
		}
		return false;
	}

	public static void main(String args[])
	{
//		Sort sort = new Sort();
//		float[] arraything = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		System.out.println(sort.sumArray((arraything)));
//		int[] array1 = { 1, 2, 3, 4, 5 };
//		int[] array2 = { 1, 2, 3 };
		int[] nums = {1,2,3,4,5,6,7,7,8};
//		for (int i = 0; i < array1.length; i++)
//		{
//			System.out.print(array1[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < array2.length; i++)
//		{
//			System.out.print(array2[i]);
//		}
//		System.out.println();
//		switchThem(array1, array2);
//		for (int i = 0; i < array1.length; i++)
//		{
//			System.out.print(array1[i]);
//		}
//		System.out.println();
//		for (int i = 0; i < array2.length; i++)
//		{
//			System.out.print(array2[i]);
//		}
		
		System.out.println(hasDuplicate(nums));
	}
}
