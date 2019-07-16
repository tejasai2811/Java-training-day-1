package colections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		
		//List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		names.add("Pavan");
		names.add("Shantanu");
		names.add("Shanti");
		names.add("John");
		names.add("Nikhil");
		names.add("Shanti");
		names.add("Pavan");
		
		System.out.println(names);
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
