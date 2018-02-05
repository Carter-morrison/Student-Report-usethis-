package com.java.gradereport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;
import com.java.gradereport.*;

public class SgraList
{
	public static String columnAverage(ArrayList<Studentv2> array)
	{
		int itrack =0;
		ArrayList greatest = new ArrayList<>();
		int sum =0;
		for(int i =0; i < array.get(0).grades.size(); i++)
		{
			sum = 0;
			itrack++;
			for(int j = 0; j < array.size(); j++) {
				sum += array.get(j).grades.get(i);
			}
			greatest.add(sum/array.size());
		}
		for (int j = 0; j < greatest.size(); j++)
			System.out.print("\t" + greatest.get(j));
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

	public static String greatestColumn(ArrayList<Studentv2> array)
	{
		int itrack =0;
		ArrayList greatest = new ArrayList<>();
		int sum =0;
		for(int i =0; i < array.get(0).grades.size(); i++)
		{
			sum = 0;
			for(int j = 0; j < array.size(); j++) {
				if(sum < array.get(j).grades.get(i)) {
					sum = array.get(j).grades.get(i);
				}
			}
			greatest.add(sum);
		}
		for (int j = 0; j < greatest.size(); j++)
			System.out.print("\t" + greatest.get(j));
		return "";

	}

	public static String leastColumn(ArrayList<Studentv2> array)
	{
		int itrack =0;
		ArrayList least = new ArrayList<>();
		int sum =1000;
		for(int i =0; i < array.get(0).grades.size(); i++)
		{
			sum = 1000;
			itrack++;
			for(int j = 0; j < array.size(); j++) {
				if(sum > array.get(j).grades.get(i)) {
					sum = array.get(j).grades.get(i);
				}
			}
			least.add(sum);
		}
		for (int j = 0; j < least.size(); j++)
			System.out.print("\t" + least.get(j));
		return "";

	}

	public static double studentAverage(Studentv2 students)
	{
		double sum = 0;
		for (int i = 0; i < students.grades.size(); i++)
		{
			sum += students.grades.get(i);
		}
		sum = sum / (students.grades.size());
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
		ArrayList<Studentv2> coStudents = new ArrayList<Studentv2>();
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
			Studentv2 newStudent = new Studentv2(studentId, firstName, lastName, address);

			coStudents.add(newStudent);

		}

		// Sorts.insertionSort(coStudents);
		// for (int i = 0; i < coStudents.length; i++)
		// {
		// System.out.println(coStudents[i]);
		// }

		ArrayList<Integer> gradeArray = new ArrayList<Integer>();
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
			gradeArray.add(fileScan.nextInt());

		}
		ListIterator iterator1 = coStudents.listIterator();
		ListIterator iterator2 = gradeArray.listIterator();
		Studentv2 temp = null;
		while (iterator2.hasNext())
		{
			count2 = (int) iterator2.next();
			if (count2 > 999)
			{
				while (iterator1.hasNext())
				{
					Studentv2 student1 = (Studentv2) iterator1.next();
					if (count2 == student1.id)
					{
						temp = student1;
						count2 = (int) iterator2.next();
						break;
					}
				}
			}
			temp.grades.add(count2);
		}

		System.out.println(gradeArray);

		for (int i = 0; i < 10; i++)
			System.out.println(coStudents.get(i).grades);

		Comparator<Studentv2> compare = (sd1,sd2) -> sd1.compareTo(sd2);
		coStudents.sort(compare);
		for (int i = 0; i < coStudents.size(); i++)
		{
			
			System.out.print(coStudents.get(i).firstName + " " + coStudents.get(i).lastName + " \t");
			for (int j = 0; j < coStudents.get(i).grades.size(); j++)
			{
				System.out.print(coStudents.get(i).grades.get(j) + " \t");

			}
		
		 System.out.print(studentAverage(coStudents.get(i)) + "\t" +
		 grade((studentAverage(coStudents.get(i)))));
		 System.out.println();
		 }
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.print("\t Max:");
		System.out.println(greatestColumn(coStudents));
		System.out.print("\t Min:");
		System.out.println(leastColumn(coStudents));
		System.out.print("\t Avgs:");
		System.out.print(columnAverage(coStudents));
		System.out.println("\n");
		for (int i = 0; i < coStudents.size(); i++)
		{
			System.out.println(coStudents.get(i));
			System.out.println();
		}

	}
	// System.out.println();
	// System.out.println(columnAverage(gradeArray));
	// System.out.println(rowAverage(gradeArray));

}
