package ArrayListSample.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ArrayListSampleClass {

	public static void main(String[] args) {
		//ArrayList , LinkedList - accepts duplicate and null values , insertion order maintains
		// set - unique elements
		// hashset - allows one null value and unique values , no insertion order
		// LinkedHashSet -allows one null value and unique values , maintains insertion order
		//Treeset - No null and no duplicate value and sorted format 
		//Map - unique keys
		//Hashmap - allows one null key , multiple null values and duplicate values can give, not key
		//TreeMap - no null keys , allows null values and duplicate values
		
System.out.println("Hello , we are going learn ArrayList from colloection framework!!! \n");
        System.out.println("Welcome to CBSE School");
     Scanner sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("ArrayList Enter how many students wants joined in this year ");
		al.add(null);
		al.add("hari");
		al.add(null);
		al.add("hari");
		al.add(null);
		al.add("mani");
		al.add("ka ka");
		al.add("jk jk");
		for(String students :al ) {
			System.out.println(students);		
		}
		
		int numberOfStudents = sc.nextInt();
		String studentName="";
		System.out.println("1.Enter student names :");
	
		sc.nextLine();
		while(numberOfStudents>0) {
			studentName = sc.nextLine();
			al.add(studentName);
			numberOfStudents--;
		}		
		for(String students :al ) {
			System.out.println(students);		
		}
		System.out.println("Enter the index to add the student ");
		int index = sc.nextInt();
		System.out.println("Enter the student name to add :");
		sc.nextLine();
		String newName = sc.nextLine();
		al.add(index,newName);
		System.out.println("Students list after inserting new name:");
		for(String students :al ) {
			System.out.println(students);		
		}
		
		Collections.sort(al);
		System.out.println("Students sorted list :");
		for(String students :al ) {
			System.out.println(students);		
		}
		
		System.out.println("Enter the student name to remove ");
		String name = sc.nextLine();
//		for(String names: al) {
//			if(names.equals(name)) {
//				al.remove(name);
//			}
//		}
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			if(name.equals(itr.next())) {
				itr.remove();
			}
		}
		System.out.println("Students list after removing the "+name);
		for(String students :al ) {
			System.out.println(students);		
		}

	}

}
