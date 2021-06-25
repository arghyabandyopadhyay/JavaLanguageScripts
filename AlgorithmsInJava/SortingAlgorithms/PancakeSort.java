// Java program to
// sort array using
// pancake sort
import java.io.*;

class PancakeSort {
	int arrayToBeSorted[];

	/* Reverses arrayToBeSorted[0..i] */
	 void flip( int i)
	{
		int temp, start = 0;
		while (start < i)
		{
			temp = arrayToBeSorted[start];
			arrayToBeSorted[start] = arrayToBeSorted[i];
			arrayToBeSorted[i] = temp;
			start++;
			i--;
		}
	}

	// Returns index of the 
	// maximum element in 
	// arrayToBeSorted[0..n-1] 
	 int findMax(int n)
	{
		int mi, i;
		for (mi = 0, i = 0; i < n; ++i)
			if (arrayToBeSorted[i] > arrayToBeSorted[mi])
				mi = i;
		return mi;
	}

	// The main function that
	// sorts given array using 
	// flip operations
	 int pancakeSort(int n)
	{
		// Start from the complete
		// array and one by one
		// reduce current size by one
		for (int curr_size = n; curr_size > 1; 
								--curr_size)
		{
			// Find index of the
			// maximum element in
			// arrayToBeSorted[0..curr_size-1]
			int mi = findMax(curr_size);

			// Move the maximum element
			// to end of current array
			// if it's not already at 
			// the end
			if (mi != curr_size-1)
			{
				// To move at the end,
				// first move maximum
				// number to beginning
				flip(mi);

				// Now move the maximum 
				// number to end by
				// reversing current array
				flip(curr_size-1);
			}
		}
		return 0;
	}

	/* Driver function to check for above functions*/
	// public static void main (String[] args)
	// {
	// 	int arrayToBeSorted[] = {23, 10, 20, 11, 12, 6, 7};
	// 	int n = arrayToBeSorted.length;
		
	// 	pancakeSort(n);
		
	// 	System.out.println("Sorted Array: ");
	// 	printArray(arrayToBeSorted, n);
	// }

	public static void main(String args[])
	{
		PancakeSort m=new PancakeSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.pancakeSort(args.length);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}
/* This code is contributed by Devesh Agrawal*/
