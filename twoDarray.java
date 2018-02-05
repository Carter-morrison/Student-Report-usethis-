package com.java.gradereport;

import java.text.DecimalFormat;
import java.util.Arrays;

public class twoDarray
{
	public static int avgArray(int[] array)
	{
		int count = 0;

		for (int i = 0; i < array.length; i++)
		{
			count += array[i];
		}
		return count/5;
	}
	public String rowSum(int[][] scores)
	{
		final int ROWS = scores.length;
		final int COLUMNS = scores[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int row = 0; row < ROWS; row++)
			for (int column = 0; column < COLUMNS; column++)

			{
				sodaSum[row] += scores[row][column];
				personSum[column] += scores[row][column];
			}
		for (int i = 0; i < sodaSum.length; i++)
		{
			System.out.println("Sum of row " + i + " = " + sodaSum[i]);
		}
		return "";
	}

	public String columnSum(int[][] scores)
	{
		final int ROWS = scores.length;
		final int COLUMNS = scores[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int row = 0; row < ROWS; row++)
			for (int column = 0; column < COLUMNS; column++)

			{
				sodaSum[row] += scores[row][column];
				personSum[column] += scores[row][column];
			}
		for (int i = 0; i < personSum.length; i++)
		{
			System.out.println("Sum of column " + i + " = " + personSum[i]);
		}
		return "";
	}

	public String majorDiagonal(int[][] scores)
	{
		final int ROWS = scores.length;
		final int COLUMNS = scores[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int i = 0; i < scores.length; i++)
		{
			sodaSum[0] += scores[i][i];

		}

		System.out.println("Sum of major diagonal = " + sodaSum[0]);

		return "";
	}

	public String minorDiagonal(int[][] scores)
	{
		final int ROWS = scores.length;
		final int COLUMNS = scores[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int i = scores.length - 1; i >= 0; i--)
		{

			sodaSum[0] += scores[i][(scores.length - 1) - i];

		}

		System.out.println("Sum of minor diagonal = " + sodaSum[0]);

		return "";
	}

	public String greatest(int[][] array)
	{
		int jtrack = 0;
		int itrack = 0;
		int track = 0;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] > track)
				{
					track = array[i][j];
					itrack = i;
					jtrack = j;
				}
		System.out.println("Greatest num is: " + track);
		return "";

	}

	public static String least(int[][] array)
	{
		int jtrack = 0;
		int itrack = 0;
		int track = array[0][0];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] < track)
				{
					track = array[i][j];
					itrack = i;
					jtrack = j;
				}
		System.out.println("Least num is :" + track); 
		return "";

	}
	public static String leastIndex(int[][] array)
	{
		int jtrack = 0;
		int itrack = 0;
		int track = array[0][0];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] < track)
				{
					track = array[i][j];
					itrack = i;
					jtrack = j;
				}
		System.out.println("Least num index is: " + itrack + "," + jtrack);
		return "";

	}
	public static String greatestIndex(int[][] array)
	{
		int jtrack = 0;
		int itrack = 0;
		int track = array[0][0];
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i].length; j++)
				if (array[i][j] > track)
				{
					track = array[i][j];
					itrack = i;
					jtrack = j;
				}
		System.out.println("Greatest num index is: " + itrack + "," + jtrack);
		return "";

	}
	
	
	public static String printArray(int[][] scores)
	{

		System.out.println(Arrays.deepToString(scores));	
		
		return "";
	}
	public static String greatEach(int[][] array)
	{
		
			int jtrack = 0;
			int itrack = 0;
			int track = 0;
			for (int[] row:array)
				for (int column:row)
					if (column > track)
					{
						track = column;
					}
			System.out.println("Greatest num is: " + track);
			return "";

		
	}
	public static String leastEach(int[][] array)
	{
		
			int jtrack = 0;
			int itrack = 0;
			int track = array[0][0];
			for (int[] row:array)
				for (int column:row)
					if (column < track)
					{
						track = column;
					}
			System.out.println("Least num is: " + track);
			return "";

		
	}
	public static String eachSumRow(int[][] array)
	{
		final int ROWS = array.length;
		final int COLUMNS = array[0].length;
		int seven = 0;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int[] row:array) {
			int sum = 0;
			
			for (int column:row)

			{
				sum += column;
			}
			sodaSum[seven] = sum;
			seven++;
		}
		for (int i = 0; i < personSum.length; i++)
		{
			System.out.println("Sum of Row " + i + " = " + sodaSum[i]);
		}
		return "";
	}
	public static String eachSum(int[][] array) 
	{
		int track = 0;
		for (int[] row:array)
			for (int column:row)
				{
					track += column;
				}
		System.out.println("Sum with each is: " + track);
		return "";
		
		
		
	}
//	public static String eachSumColumn(int[][] array)
//	{
//		final int ROWS = array.length;
//		final int COLUMNS = array[0].length;
//		int seven = 0;
//		int[] sodaSum = new int[ROWS];
//		int[] personSum = new int[COLUMNS];
//			for()
//			{
//				sum += column;
//			}
//			sodaSum[seven] = sum;
//			seven++;
//		
//		for (int i = 0; i < personSum.length; i++)
//		{
//			System.out.println("Sum of Column " + i + " = " + personSum[i]);
//		}
//		return "";
//	}


//	public static void main(String[] args)
//	{
//		int[][] scores = { { 10, 100, 0, 30 }, { 40, 20, 50, 20 }, { 90, 70, 30, 10 }, { 10, 80, 60, 40 } };
//
//		System.out.println(majorDiagonal(scores));
//		System.out.println(minorDiagonal(scores));
//		System.out.println(greatest(scores));
//		System.out.println(greatestIndex(scores));
//		System.out.println(least(scores));
//		System.out.println(leastIndex(scores));
//		System.out.println(printArray(scores));
//		System.out.println(rowSum(scores));
//		System.out.println(columnSum(scores));
//		System.out.println(greatEach(scores));
//		System.out.println(leastEach(scores));
//		System.out.println(eachSumRow(scores));
//		System.out.println(eachSum(scores));
//
//	}
}
