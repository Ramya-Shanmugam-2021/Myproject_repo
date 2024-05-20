package concurrency;

import java.util.*;
//import java.util.Map;
import java.util.concurrent.atomic.*;

public class ConcurrentMapRunner4 {

	public static void main(String[] args){
		Map<Character,LongAdder> occurances = new Hashtable<>();
		String str= "ABCD ABCD ABCD";
	    for(char character : str.toCharArray()) {
	    	LongAdder longAdder = occurances.get(character);
	    }
	}
}
