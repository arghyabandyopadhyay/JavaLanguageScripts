class SelectionSort{
	int arrayToBeSorted[];
	void selectionSort()
	{
		int len=arrayToBeSorted.length;
		for (int i = 0; i < len-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < len; j++) 
                if (arrayToBeSorted[j] < arrayToBeSorted[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arrayToBeSorted[min_idx]; 
            arrayToBeSorted[min_idx] = arrayToBeSorted[i]; 
            arrayToBeSorted[i] = temp; 
        } 
	}
	public static void main(String args[])
	{
		SelectionSort m=new SelectionSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.selectionSort();
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}