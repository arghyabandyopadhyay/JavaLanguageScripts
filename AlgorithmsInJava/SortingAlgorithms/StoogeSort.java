// Java program to implement stooge sort 

public class StoogeSort { 
	int arrayToBeSorted[];
	// Function to implement stooge sort 
	void stoogesort(int l, int h) 
	{ 
		if (l >= h) 
			return; 

		// If first element is smaller 
		// than last, swap them 
		if (arrayToBeSorted[l] > arrayToBeSorted[h]) { 
			int t = arrayToBeSorted[l]; 
			arrayToBeSorted[l] = arrayToBeSorted[h]; 
			arrayToBeSorted[h] = t; 
		} 

		// If there are more than 2 elements in 
		// the array 
		if (h - l + 1 > 2) { 
			int t = (h - l + 1) / 3; 

			// Recursively sort first 2/3 elements 
			stoogesort(l, h - t); 

			// Recursively sort last 2/3 elements 
			stoogesort(l + t, h); 

			// Recursively sort first 2/3 elements 
			// again to confirm 
			stoogesort(l, h - t); 
		} 
	} 

	// Driver Code 
	public static void main(String args[]) 
	{ 
		StoogeSort m=new StoogeSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.stoogesort(0,args.length-1); 
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	} 
} 
// Code Contributed by Mohit Gupta_OMG <(0_o)> 
