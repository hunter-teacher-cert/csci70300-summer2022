import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 20;

	SortSearchReference ss = new SortSearchReference(size);
	
	
	System.out.println(ss);
		
	long start,elapsed;

	start = System.currentTimeMillis();
	ss.sort();
	System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);
	System.out.println(ss.get(17));
	
	System.out.println(ss.linearSearch(ss.get(17)));
	System.out.println(ss.binarySearch(ss.get(17)));
			   

	      

    }
}
