package utils;

import java.util.Iterator;
import java.util.Stack;

public class ArrayListTest {
	
	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("One");
//		list.add("Two");
//		
//		Iterator<String> it = list.iterator();
//		
//		while (it.hasNext()) {
//			String s = it.next();
//			
//			
//			System.out.println(s);
//		}
		
	System.out.println("tests");
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		//stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		
		
		
		
		
	}
	
	
	}
	

}
