package ArrayListSample.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collectionsclass {

	public static void main(String[] args) {
		//ArrayList , LinkedList - accepts duplicate and null values , insertion order maintains
				// set - unique elements
				// hashset - allows one null value and unique values , no insertion order
				// LinkedHashSet -allows one null value and unique values , maintains insertion order
				//Treeset - No null and no duplicate value and sorted format 
				//Map - unique keys
				//Hashmap - allows one null key , multiple null values and duplicate values can give, not key
				//TreeMap - no null keys , allows null values and duplicate values
				// Queue -FIFO queue structure it is using , not allows null values. removes first element
		System.out.println("Hello , we are going learn colloection framework!!! \n");
		       // System.out.println("Welcome to CBSE School");
		     Scanner sc = new Scanner(System.in);
				ArrayList<String> al = new ArrayList<String>();
				System.out.println("ArrayList ******");
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
				LinkedList<String> ll = new LinkedList<String>();
				System.out.println("\nLinkedList ******");
				ll.add(null);
				ll.add("hari");
				ll.add(null);
				ll.add("hari");
				ll.add(null);
				ll.add("mani");
				ll.add("ka ka");
				ll.add("jk jk");
				for(String students :ll ) {
					System.out.println(students);		
				}
				HashSet<String> hl = new HashSet<String>();
				System.out.println("\nHashSet ******");
				hl.add(null);
				hl.add("hari");
				hl.add(null);
				hl.add("hari");
				hl.add(null);
				hl.add("mani");
				hl.add("ka ka");
				hl.add("jk jk");
				for(String students :hl ) {
					System.out.println(students);		
				}
				LinkedHashSet<String> lhl = new LinkedHashSet<String>();
				System.out.println("\nLinkedHashSet ******");
				lhl.add(null);
				lhl.add("hari");
				lhl.add(null);
				lhl.add("hari");
				lhl.add(null);
				lhl.add("mani");
				lhl.add("ka ka");
				lhl.add("jk jk");
				for(String students :lhl ) {
					System.out.println(students);		
				}
				TreeSet<String> tl = new TreeSet<String>();
				System.out.println("\nTreeSet ******");
			//	tl.add(null);
				tl.add("hari");
			//	tl.add(null);
				tl.add("hari");
			//	tl.add(null);
				tl.add("mani");
				tl.add("ka ka");
				tl.add("jk jk");
				for(String students :tl ) {
					System.out.println(students);		
				}
				
				HashMap<Integer,String> hm = new HashMap<Integer,String>();
				System.out.println("\nHashMap ******");
				hm.put(1,null);
				hm.put(2,"hari");
				hm.put(3,null);
				hm.put(4,"hari");
				hm.put(5,null);
				hm.put(null,"mani");
				hm.put(7,"ka ka");
				hm.put(null,"jk jk");
				hm.put(7,"oooa ka");
				hm.put(9,"ka mmma");
				hm.put(7,"ka mmma");
				hm.put(8,"ka mmma");
				
				for(Map.Entry m :hm.entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());		
				}
				TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
				System.out.println("\nTreeMap ******");
				tm.put(1,null);
				tm.put(2,"hari");
				tm.put(3,null);
				tm.put(4,"hari");
				tm.put(5,null);
			//	tm.put(null,"mani");
				tm.put(7,"ka ka");
				//tm.put(null,"jk jk");
				tm.put(7,"oooa ka");
				tm.put(9,"ka mmma");
				tm.put(7,"ka mmma");
				tm.put(8,"ka mmma");	
				for(Map.Entry m :tm.entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());		
				}
				System.out.println(tm.higherKey(7));
					LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
				System.out.println("\nLinkedHashMap ******");
				lhm.put(1,null);
				lhm.put(2,"hari");
				lhm.put(3,null);
				lhm.put(4,"hari");
				lhm.put(5,null);
				lhm.put(null,"mani");
				lhm.put(7,"ka ka");
				lhm.put(null,"jk jk");
				lhm.put(7,"oooa ka");
				lhm.put(9,"ka mmma");
				lhm.put(7,"ka mmma");
				lhm.put(8,"ka mmma");
				
				for(Map.Entry m :lhm.entrySet()) {
					System.out.println(m.getKey()+" "+m.getValue());		
				}
				
				System.out.println("\nQueue ******");
				Queue<Integer> queue = new PriorityQueue();
				queue.add(1);
				queue.offer(2);
				//queue.add(null);
				queue.offer(2);
				queue.add(3);
				queue.offer(2);
System.out.println(queue);
queue.poll();//removes first element
System.out.println(queue);

System.out.println(queue.peek());//returns first or head of the element

	}

}
