package com.java.gradereport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.java.cds.CD;

		
		public class Student implements Comparable
		{
			public int id,zipcode;
		   public String firstName, lastName;
		   public Address homeAddress, schoolAddress;
		   int[] grades = new int[6];
		   //-----------------------------------------------------------------
		   //  Sets up this Student object with the specified initial values.
		   //-----------------------------------------------------------------
		   public static double studentAverage(int[] students)
			{
				double sum=0;
				for(int i = 0; i < students.length;i++) {
					sum += students[i];
				}
					 sum = sum/(students.length-1);
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
		   public Student (int studentID, String first, String last, Address home)
		   {
		      firstName = first;
		      lastName = last;
		      homeAddress = home;
		      id = studentID;		       
		   }
		   //-----------------------------------------------------------------
		   //  Returns this Student object as a string.
		   //-----------------------------------------------------------------
		   public String toString()
		   {
		      String result;
		      result = id + " ";
		      result += firstName + " " + lastName + "\n";
		      result += "Home Address: " + homeAddress + "\n";
		      result += "Final Grade: "+studentAverage(this.grades)+" "+grade(studentAverage(this.grades));
		     
		      return result;
		   }
		@Override
		public int compareTo(Object student2)
		{
			int result;
			if(lastName.equals(((Student)student2).lastName))
				result = firstName.compareTo(((Student)student2).firstName);
			else
				result = lastName.compareTo(((Student)student2).lastName);
			return result;
		}
		}

