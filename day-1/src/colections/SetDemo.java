package colections;

import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		//List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();
		names.add("Pavan");
		names.add("Shantanu");
		names.add("Shanti");
		names.add("John");
		names.add("Nikhil");
		names.add("Shanti");
		names.add("Pavan");
		
		System.out.println(names);
		
		/*Iterator<String> itr = names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		for(String s:names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		names.stream().forEach(System.out::println);
		
		System.out.println();
		
		names.stream().forEach(s->System.out.println(s));
	}

}
