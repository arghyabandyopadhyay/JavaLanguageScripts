import java.util.*; 
class RadixSort
{
	int arrayToBeSorted[];
	// A utility function to get maximum value in arrayToBeSorted[] 
    int getMax(int n) 
    { 
        int mx = arrayToBeSorted[0]; 
        for (int i = 1; i < n; i++) 
            if (arrayToBeSorted[i] > mx) 
                mx = arrayToBeSorted[i]; 
        return mx; 
    } 
    // A function to do counting sort of arrayToBeSorted[] according to 
    // the digit represented by exp. 
    void countSort(int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count, 0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[(arrayToBeSorted[i] / exp) % 10]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) { 
            output[count[(arrayToBeSorted[i] / exp) % 10] - 1] = arrayToBeSorted[i]; 
            count[(arrayToBeSorted[i] / exp) % 10]--; 
        } 
  
        // Copy the output array to arrayToBeSorted[], so that arrayToBeSorted[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arrayToBeSorted[i] = output[i]; 
    }
	// The main function to that sorts arrayToBeSorted[] of size n using 
    // Radix Sort 
    void radixSort(int n) 
    { 
        // Find the maximum number to know number of digits 
        int m = getMax(n); 
  
        // Do counting sort for every digit. Note that 
        // instead of passing digit number, exp is passed. 
        // exp is 10^i where i is current digit number 
        for (int exp = 1; m / exp > 0; exp *= 10) 
            countSort(n, exp); 
    } 
	public static void main(String args[])
	{
		RadixSort m=new RadixSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.radixSort(args.length);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}