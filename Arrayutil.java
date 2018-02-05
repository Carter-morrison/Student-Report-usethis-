package com.java.gradereport;

public class Arrayutil
{

	public static int greatestInt(int[] array)
	{
		int track = 0;
		int itrack = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > track)
			{
				track = array[i];
				itrack = i;
			}
		}
		return track;

	}

	public static int sumArray(int[] array)
	{
		int count = 0;

		for (int i = 0; i < array.length; i++)
		{
			count += array[i];
		}
		return count;
	}

	public static int arrayIndex(int[] array)
	{
		int track = 0;
		int itrack = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > track)
			{
				track = array[i];
				itrack = i;
			}
		}
		return itrack;
	}
	public static int leastInt(int[] array)
	{
		int track = array[0];
		int itrack = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < track)
			{
				track = array[i];
				itrack = i;
			}
		}
		return track;

	}
	public static int arrayLeastIndex(int[] array)
	{
		int track = array[0];
		int itrack = 0;
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] < track)
			{
				track = array[i];
				itrack = i;
			}
		}
		return itrack;
	}
	public static int meanArray(int[] array)
	{
		int count = 0;
		int icount = 0;
		for (int i = 0; i < array.length; i++)
		{
			count += array[i];
			icount++;
		}
		return count/icount;
	}
	public static void main(String args[])
	{
		int[] myArray = { 225, 25, 10, 15, 45 };
		System.out.println(greatestInt(myArray));
		System.out.println(arrayIndex(myArray));
		System.out.println(sumArray(myArray));
		System.out.println(leastInt(myArray));
		System.out.println(arrayLeastIndex(myArray));
		System.out.println(meanArray(myArray));
	}
}
