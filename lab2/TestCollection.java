
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class TestCollection {
	
	// Ex - 1
	// Function receives a stack of strings and return a new stack containing the lengths of the strings in the same order.
	public static Stack<Integer> getStringsLength(Stack<String> st) {
		Stack<String> tmp = new Stack<String>();
		Stack<Integer> strLength = new Stack<Integer>();
		
		while(!st.isEmpty()) {
			tmp.push(st.pop());
		}
		
		while(!tmp.isEmpty()) {
			strLength.push(tmp.peek().length());
			st.push(tmp.pop());
		}
		return strLength;
	}
	
	// Ex - 2
	// Function receives an array of stack of numbers and return the sum of the heads of the stacks.
	public static int getTopSum(Stack<Integer>[] stacks) {
		int sum = 0;
		for (int i = 0; i < stacks.length; i++) {
			if(!stacks[i].isEmpty()) {
				sum += stacks[i].peek();
			}
		}
		return sum;
	}
	
	// Ex - 3
	// Function receives a vector and return true if the vector is sorted and false if it isn't.
	public static boolean isSorted (Vector<Integer> v) {
		for (int i = 0; i < v.size() - 1; i++) {
			if(v.get(i) > v.get(i + 1)) {
				return false;
			}
		}
		return true;
	}
	
	// Ex - 4
	// Function receives 2 ArrayLists and return a new merged and ordered list.
	public static ArrayList<Integer> merge (ArrayList<Integer> a, ArrayList<Integer> b){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		newList.addAll(a);
		newList.addAll(b);
		Collections.sort(newList);
		return newList;
	}
	
	// Ex - 5
	// Function receives a LinkedList of strings and swap every 2 string in the list.
	public static LinkedList<String> reversePairs (LinkedList<String> l){
		LinkedList<String> newList = new LinkedList<String>();
		newList.addAll(l);
		for (int i = 0; i < newList.size() - 1; i += 2) {
			Collections.swap(newList, i, i + 1);
		}
		return newList;
	}

	public static void main(String[] args) {
		
		/*** EX-1 ***/
		System.out.println("EX-1\n----");
		Stack<String> st = new Stack<String>();
		st.push("Ronaldinho");
		st.push("Messy");
		st.push("Pele");
		st.push("Maradona");
		System.out.println("Original stack: " + st);
		System.out.println("Strings length: " + getStringsLength(st));
		
		/*** EX-2 ***/
		System.out.println("\nEX-2\n----");
		Stack<Integer>[] arr = new Stack[3];
		arr[0] = new Stack<Integer>();
		arr[1] = new Stack<Integer>();
		arr[2] = new Stack<Integer>();
		arr[0].push(5);
		arr[0].push(8);
		arr[2].push(3);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Stack " + (i + 1) + ": " + arr[i]);
		}
		System.out.println("Stack head sum: " + getTopSum(arr));
		
		/*** EX-3 ***/
		System.out.println("\nEX-3\n----");
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		v.add(4);
		v.add(8);
		v.add(13);
		v.add(20);
		System.out.println("Original vector: " + v);
		System.out.println("Vector " + (isSorted(v)?"is":"isn't") + " sorted");
		
		/*** EX-4 ***/
		System.out.println("\nEX-4\n----");
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		a.add(5);
		a.add(8);
		a.add(2);
		a.add(-9);
		b.add(7);
		b.add(3);
		b.add(18);
		b.add(9);
		System.out.println("Array - 1: " + a);
		System.out.println("Array - 2: " + b);
		System.out.println("Marged & sorted" + merge(a, b));
		
		/*** EX-5 ***/
		System.out.println("\nEX-5\n----");
		LinkedList<String> c = new LinkedList<String>();
		c.add("Benny");
		c.add("Begin");
		c.add("Avi");
		c.add("Israeli");
		c.add("Ariana");
		c.add("Grande");
		System.out.println("Before: " + c);
		System.out.println("after: " + reversePairs(c));
	
		
	}

}
