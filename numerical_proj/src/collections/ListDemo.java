package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.IntToDoubleFunction;

public class ListDemo {
	public static void main(String[] args) {
		/*
		 * ArrayList<Integer> list = new ArrayList<>(); ArrayList<Integer> list2 = new
		 * ArrayList<>(25); list.add(2); list.add(5); list.add(15); Iterator<Integer>
		 * itr=list.iterator(); while(itr.hasNext()) { System.out.println(itr.next()); }
		 * ListIterator<Integer> listitr=list.listIterator(list.size());
		 * while(listitr.hasPrevious()) { System.out.println(listitr.previous()); }
		 * 
		 * ArrayList<Integer> list1 = new ArrayList<>(list); System.out.println(list);
		 * System.out.println(list1);
		 */
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
		al.add(5);
		al.add(15);
		LinkedList<Integer> list = new LinkedList<>();
		Integer x=Collections.max(al);
		System.out.println(x);
		list.add(Collections.max(al));
		System.out.println(list);
		Vector<Integer> vector=new Vector<>();
		

		/*
		 * Consumer<Integer> con= a->System.out.println(a); IntToDoubleFunction
		 * fn=i->(double)i;
		 */
		
		
		
		
		
		
		
		
		

	}
}