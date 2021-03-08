import java.util.Arrays; 
public class GnomeSort { 

	int arrayToBeSorted[];
	void gnomeSort(int n) 
	{ 
		int index = 0; 
		while (index < n) { 
			if (index == 0) 
				index++; 
			if (arrayToBeSorted[index] >= arrayToBeSorted[index - 1]) 
				index++; 
			else { 
				int temp = 0; 
				temp = arrayToBeSorted[index]; 
				arrayToBeSorted[index] = arrayToBeSorted[index - 1]; 
				arrayToBeSorted[index - 1] = temp; 
				index--; 
			} 
		}
	} 

	public static void main(String[] args) 
	{ 
		//int arrayToBeSorted[] = {34,2,10,-9}; 
		GnomeSort m=new GnomeSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.gnomeSort(args.length); 
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
	} 
}
