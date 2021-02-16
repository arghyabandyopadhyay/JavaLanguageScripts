class RecursiveBubbleSort{
	int arrayToBeSorted[];
	void recursiveBubbleSort(int n)
	{
		// Base case
        if (n == 1)
            return;
      
        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arrayToBeSorted[i] > arrayToBeSorted[i+1])
            {
                // swap arrayToBeSorted[i], arrayToBeSorted[i+1]
                int temp = arrayToBeSorted[i];
                arrayToBeSorted[i] = arrayToBeSorted[i+1];
                arrayToBeSorted[i+1] = temp;
            }
        // Largest element is fixed,
        // recur for remaining array
        recursiveBubbleSort(n-1);
	}
	public static void main(String args[])
	{
		RecursiveBubbleSort m=new RecursiveBubbleSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.recursiveBubbleSort(m.arrayToBeSorted.length);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}