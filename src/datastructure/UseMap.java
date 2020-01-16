package datastructure;

import java.util.*;

public class UseMap {

	public static <Lsit> void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		Map<String, List<String>> list = new HashMap<String, List<String>>();


		List<String> list1 = new ArrayList();
		list1.add("UK");
		list1.add("Belgium");
		list1.add("Spain");
		list1.add("Italy");

		List<String> list2 = new ArrayList();
		list2.add("USA");
		list2.add("Canada");
		list2.add("Brazil");


		List<String> list3 = new ArrayList();
		list3.add("China");
		list3.add("Pakistan");
		list3.add("India");

		list.put("Europe", list1);
		list.put("America", list2);
		list.put("Asia", list3);

		list.forEach((k, v) -> System.out.println("Key = "
				+ k + ", Value = " + v));

		System.out.println(" using iterator");
		Iterator<Map.Entry<String, List<String>>> itr = list.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<String, List<String>> entry = itr.next();
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());


		}

	}
}