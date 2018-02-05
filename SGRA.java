package com.java.gradereport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import com.java.gradereport.*;

public class SGRA
{
	public static String columnAverage(int[][] gradeArray)
	{
		final int ROWS = gradeArray.length;
		final int COLUMNS = gradeArray[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int row = 0; row < ROWS; row++)
			for (int column = 1; column < COLUMNS; column++)

			{
				sodaSum[row] += gradeArray[row][column];
				personSum[column] += gradeArray[row][column];
			}
		for (int i = 1; i < personSum.length; i++)
		{
			System.out.print("\t" + (double)personSum[i] / 10);
		}
		return "";
	}

	public static int avgArray(int[] array)
	{
		int count = 0;

		for (int i = 0; i < array.length; i++)
		{
			count += array[i];
		}
		return count / 5;
	}

	public static String rowAverage(int[][] gradeArray)
	{
		final int ROWS = gradeArray.length;
		final int COLUMNS = gradeArray[0].length;
		int[] sodaSum = new int[ROWS];
		int[] personSum = new int[COLUMNS];
		for (int row = 0; row < ROWS; row++)
			for (int column = 1; column < COLUMNS; column++)

			{
				sodaSum[row] += gradeArray[row][column];
				personSum[column] += gradeArray[row][column];
			}
		for (int i = 0; i < sodaSum.length; i++)
		{
			System.out.println("Avg of row " + (i + 1) + " = " + (double) sodaSum[i] / 5);
		}
		return "";
	}

	public static String greatestColumn(int[][] array)
	{
		int jtrack = 0;
		int[] itrack = new int[7];
		int track = 0;
		for (int row = 0; row < array.length; row++)
		{

			for (int column = 1; column < array[column].length; column++)
				if (array[row][column] > itrack[column])
				{
					itrack[column] = array[row][column];

				}
		}
		for (int i = 1; i < itrack.length; i++)
			System.out.print("\t" + itrack[i]);
		return "";

	}
	public static String leastColumn(int[][] array)
	{
		int jtrack = 0;
		int[] itrack = new int[]{100,100,100,100,100,100,0};
		int track = 0;
		for (int row = 0; row < array.length; row++)
		{

			for (int column = 1; column < array[column].length; column++)
				if (array[row][column] < itrack[column])
				{
					itrack[column] = array[row][column];

				}
		}
		for (int i = 1; i < itrack.length; i++)
			System.out.print("\t" + itrack[i]);
		return "";

	}

	public static double studentAverage(Student students)
	{
		double sum=0;
		for(int i = 0; i < students.grades.length;i++) {
			sum += students.grades[i];
		}
			 sum = sum/(students.grades.length-1);
			return sum;
	}

	public static char grade(double average)
	{
		if (average >= 90)
			return 'A';
		if (average >= 80)
			return 'B';
		if (average >= 70)
			return 'C';
		if (average >= 60)
			return 'D';
		else
			return 'F';
	}

	public static void main(String args[])
	{
		Student[] coStudents = new Student[10];
		String firstName = "", lastName = "", street, town, st;
		String student;
		int count = 0, count1 = 1, count2 = 0;
		int holder = 0;
		int studentId = 0, zipcode;
		String delim = ",";
		Scanner fileScan = null, studentScan;
		Address address = null;
		try
		{
			fileScan = new Scanner(new File("C:\\JavaTransfer\\ACTE Week Assignments\\Student_data.txt"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (fileScan.hasNext())
		{
			count++;
			student = fileScan.nextLine();
			studentScan = new Scanner(student);
			studentScan.useDelimiter(delim);
			studentId = studentScan.nextInt();
			// studentScan.next();
			firstName = studentScan.next();
			lastName = studentScan.next();
			street = studentScan.next();
			town = studentScan.next();
			st = studentScan.next();
			zipcode = studentScan.nextInt();

			address = new Address(street, town, st, zipcode);
			Student newStudent = new Student(studentId, firstName, lastName, address);
			for (int i = count - 1; i < count; i++)
			{
				coStudents[i] = newStudent;
			}

		}
		
		// Sorts.insertionSort(coStudents);
		// for (int i = 0; i < coStudents.length; i++)
		// {
		// System.out.println(coStudents[i]);
		// }

		int[][] gradeArray = new int[10][7];
		try
		{
			fileScan = new Scanner(new File("C:\\JavaTransfer\\ACTE Week Assignments\\Student_tests.txt"));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while (fileScan.hasNext())
		{
			for (int i = count1 - 1; i < count1; i++)
			{

				gradeArray[i][0] = fileScan.nextInt();
				for (int j = 1; j < 6; j++)
				{
					holder = fileScan.nextInt();
					gradeArray[i][j] = holder;

				}

			}

			count1++;

		}
		for (int i = 0; i < 10; i++)
			for (int b = 0; b < coStudents.length; b++)
			{
				if (gradeArray[i][0] == (coStudents[b].id))
				{
					for (int c = 1; c < 7; c++)
					{
						if (gradeArray[i][c] != coStudents[b].id)
							coStudents[b].grades[c - 1] = gradeArray[i][c];
					}
				}
			}
		Sorts.insertionSort(coStudents);
		for (int i = 0; i < 10; i++)
		{
			System.out.print(coStudents[i].firstName + " " + coStudents[i].lastName+" \t");
			for (int j = 0; j < coStudents[i].grades.length; j++)
			{
				System.out.print( coStudents[i].grades[j]+ " \t" );

			}
			System.out.print(studentAverage(coStudents[i]) + "\t" + grade((studentAverage(coStudents[i]))));
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("\t Max:");
		System.out.println(greatestColumn(gradeArray));
		System.out.print("\t Min:");
		System.out.println(leastColumn(gradeArray));
		System.out.print("\t Avgs:");
		System.out.print(columnAverage(gradeArray));
		System.out.println("\n");
		for (int i = 0; i < coStudents.length; i++)
		{
			System.out.println(coStudents[i]);
			System.out.println();
		}
		
	}
	// System.out.println();
	// System.out.println(columnAverage(gradeArray));
	// System.out.println(rowAverage(gradeArray));
	

}
