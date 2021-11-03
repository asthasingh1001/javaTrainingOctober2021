package Test.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	public static void main(String args[]) {
		List<String> languages = Arrays.asList("Java", "Python", "JavaScript");
        List<String> technology = Arrays.asList("Front-end", "Back-end", "Full-stack");
        List<String> laptop = Arrays.asList("Dell", "Acer", "Lenovo");
        
        
        List<List<String>> myList = new ArrayList<>();
        myList.add(languages);
        myList.add(technology);
        myList.add(laptop);
        
        List<String> listitems = myList.stream().flatMap(collectdata -> collectdata.stream()).
        		collect(Collectors.toList());
        System.out.println(listitems);

	}

}
