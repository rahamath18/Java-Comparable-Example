## Java Comparable Example through it's compareTo() method

### Key points on Comparable

- Comparable interface available since java 1.2
- Comparable interface exists in java.lang package
- As of latest OpenJDK 14 API doc, Comparable interface provides only one method: compareTo()
	refer https://download.java.net/java/early_access/jdk14/docs/api/java.base/java/lang/Comparable.html
- Comparable interface can be used to sort collection elements
- Comparable interface only provides a single sorting sequence
- Use Collections.sort(List) method for sorting

### Output of this example

Before (Comparable) sort	    [5|EEE|555.55, 404|AAA|111.11, 305|CCC|333.33, 1|DDD|444.44, 2|BBB|222.22]

After (Comparable) sort by Id	[1|DDD|444.44, 2|BBB|222.22, 5|EEE|555.55, 305|CCC|333.33, 404|AAA|111.11]
