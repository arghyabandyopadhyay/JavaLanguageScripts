class MergeSort
{
	int arrayToBeSorted[];
	void mergeSort(int p, int r)
	{
		if(p<r)
		{
			int q=(int)Math.floor((p+r)/2);
			mergeSort(p,q);
			mergeSort(q+1,r);
			merge(p,q,r);
		}
	}
	void merge(int p,int q,int r)
	{
		int n1=q-p+1;
		int n2=r-q;
		int L[]=new int[n1+1];
		int R[]=new int[n2+1];
		for(int i=0;i<n1;i++)L[i]=arrayToBeSorted[p+i];
		for(int i=0;i<n2;i++)R[i]=arrayToBeSorted[q+i+1];
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		int i=0;
		int j=0;
		for (int k=p;k<=r;k++)
		{
			if(L[i]<=R[j])
			{
				arrayToBeSorted[k]=L[i];
				i++;
			}
			else
			{
				arrayToBeSorted[k]=R[j];
				j++;
			}
		}
	}
	public static void main(String args[])
	{
		MergeSort m=new MergeSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.mergeSort(0,args.length-1);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	}
}