package lists;

import java.util.*;

public class MyArrayLists {

	public static void main(String[] args) {
		
		List <String> fruits = new LinkedList();
		List <String> vegetables = new ArrayList();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Hi");
//		vegetables.add("Potato");
//		vegetables.add("Tomato");
//		vegetables.add("Carrot");
		
//		List<String> toRemove = new ArrayList();
//		
//		toRemove.add("Apple");
//		toRemove.add("Hi");
		
		
//		fruits.removeAll(toRemove);
		
//		fruits.addAll(vegetables);
		
//		fruits.set(1,"Banana");
//		fruits.remove(2);
//		fruits.clear();
		
		String temp[] = new String[fruits.size()];
		fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
//		System.out.println(fruits.isEmpty());
		
//		Pair <String,Integer> p1 = new Pair("Anuj", 57);
//		Pair <Boolean , String> p2 = new Pair(true, "Hello");
//		
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}
