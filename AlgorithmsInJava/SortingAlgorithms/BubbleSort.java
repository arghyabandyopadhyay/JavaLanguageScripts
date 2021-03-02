class BubbleSort
{
	int arrayToBeSorted[];
	void bubbleSort()
	{
		int len=arrayToBeSorted.length;
		for(int i=0; i<len;i++)
		{
			for(int j=0; j<len-i-1; j++)
			{
				if (arrayToBeSorted[j] > arrayToBeSorted[j+1]) 
                { 
                    // swap arrayToBeSorted[j+1] and arrayToBeSorted[j] 
                    int temp = arrayToBeSorted[j]; 
                    arrayToBeSorted[j] = arrayToBeSorted[j+1]; 
                    arrayToBeSorted[j+1] = temp; 
                } 
			}
		}
	}
	public static void main(String args[])
	{
		BubbleSort m=new BubbleSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.bubbleSort();
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}