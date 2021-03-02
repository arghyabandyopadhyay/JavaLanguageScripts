// Java implementation of Counting Sort
class CountingSort {
	char arrayToBeSorted[];
    void countingSort()
    {
        int n = arrayToBeSorted.length;
 
        // The output character array that will have sorted arrayToBeSorted
        char output[] = new char[n];
 
        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arrayToBeSorted[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
 
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arrayToBeSorted[i]] - 1] = arrayToBeSorted[i];
            --count[arrayToBeSorted[i]];
        }
 
        // Copy the output array to arrayToBeSorted, so that arrayToBeSorted now
        // contains sorted characters
        for (int i = 0; i < n; ++i)
            arrayToBeSorted[i] = output[i];
    }
 
    // Driver method
    public static void main(String args[])
    {
        CountingSort m=new CountingSort();
		m.arrayToBeSorted=new char[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=args[j].charAt(0);
		m.countingSort();
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
    }
}