class QuickSort
{
	int arrayToBeSorted[];
	void quickSort(int p, int r)
	{
		if(p<r)
		{
			int q=partition(p, r); 
			quickSort(p,q-1);
			quickSort(q,r);
		}
	}
	int partition(int low, int high) 
    { 
        int pivot = arrayToBeSorted[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arrayToBeSorted[j] < pivot) 
            { 
                i++; 
  
                // swap arrayToBeSorted[i] and arrayToBeSorted[j] 
                int temp = arrayToBeSorted[i]; 
                arrayToBeSorted[i] = arrayToBeSorted[j]; 
                arrayToBeSorted[j] = temp; 
            } 
        } 
  
        // swap arrayToBeSorted[i+1] and arrayToBeSorted[high] (or pivot) 
        int temp = arrayToBeSorted[i+1]; 
        arrayToBeSorted[i+1] = arrayToBeSorted[high]; 
        arrayToBeSorted[high] = temp;
        return i+1; 
    } 
	public static void main(String args[])
	{
		QuickSort m=new QuickSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.quickSort(0,args.length-1);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}