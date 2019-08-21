package com.test.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparable {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();
		
		empList.add(new Employee(5, "EEE", 555.55F));
		empList.add(new Employee(404, "AAA", 111.11f));
		empList.add(new Employee(305, "CCC", 333.33F));
		empList.add(new Employee(1, "DDD", 444.44F));
		empList.add(new Employee(2, "BBB", 222.22F));
		
		System.out.println("Before (Comparable) sort\t" + empList);
		Collections.sort(empList);
		System.out.println("After (Comparable) sort by Id\t" + empList);
	}

}
/*

Before (Comparable) sort	    [5|EEE|555.55, 404|AAA|111.11, 305|CCC|333.33, 1|DDD|444.44, 2|BBB|222.22]
After (Comparable) sort by Id	[1|DDD|444.44, 2|BBB|222.22, 5|EEE|555.55, 305|CCC|333.33, 404|AAA|111.11]
 
*/