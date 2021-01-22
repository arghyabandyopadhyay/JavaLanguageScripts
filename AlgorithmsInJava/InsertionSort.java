class InsertionSort
{
	public static void main(String args[])
	{
		int arrayToBeSorted[]=new int[args.length];
		int i,key;
		for (int j=0;j<args.length;j++)arrayToBeSorted[j]=Integer.parseInt(args[j]);
		for (int j=1;j<args.length;j++)
		{
			key=arrayToBeSorted[j];
			i=j-1;
			while (i>=0 && arrayToBeSorted[i]>key)
			{
				arrayToBeSorted[i+1]=arrayToBeSorted[i];
				i=i-1;
			}
			arrayToBeSorted[i+1]=key;
		}
		String output="[";
		for (int j=0;j<arrayToBeSorted.length;j++)output+=arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}