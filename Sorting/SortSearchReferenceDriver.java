import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
    public static void main(String[] args) {


	int size = 1000;

	SortSearchReference ss = new SortSearchReference(size);

	
	
	// printing is really slow so we don't want
	// to print when testing time.
	// System.out.println(ss);
		
	long start,elapsed;

	start = System.currentTimeMillis();
	ss.sort();

	// System.out.println(ss);
	elapsed = System.currentTimeMillis() - start;
	System.out.println("Size: " + size + " Time: " + elapsed);
			   

	      

    }
}
