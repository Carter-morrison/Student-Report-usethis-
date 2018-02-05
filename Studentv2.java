package com.java.gradereport;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.java.cds.CD;

		
		public class Studentv2 implements Comparable
		{
			public int id,zipcode;
		   public String firstName, lastName;
		   DecimalFormat df = new DecimalFormat("0.##");
		   public Address homeAddress, schoolAddress;
		   ArrayList<Integer> grades = new ArrayList<Integer>();
		   
//		   int[] grades = new int[6];
		   //-----------------------------------------------------------------
		   //  Sets up this Student object with the specified initial values.
		   //-----------------------------------------------------------------
		   public static double studentAverage(ArrayList students)
			{
				double sum=0;
				for(int i = 0; i < students.size();i++) {
					sum += (Integer)students.get(i);
				}
					 sum = sum/(students.size());
					 
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
		   public Studentv2 (int studentID, String first, String last, Address home)
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
			if(lastName.equals(((Studentv2)student2).lastName))
				result = firstName.compareTo(((Studentv2)student2).firstName);
			else
				result = lastName.compareTo(((Studentv2)student2).lastName);
			return result;
		}
		}

