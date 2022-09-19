import java.util.*; 
  
public class PigeonholeSort 
{ 
	int arrayToBeSorted[];
    void pigeonholeSort(int n) 
    { 
        int min = arrayToBeSorted[0]; 
        int max = arrayToBeSorted[0]; 
        int range, i, j, index;  
  
        for(int a=0; a<n; a++) 
        { 
            if(arrayToBeSorted[a] > max) 
                max = arrayToBeSorted[a]; 
            if(arrayToBeSorted[a] < min) 
                min = arrayToBeSorted[a]; 
        } 
  
        range = max - min + 1; 
        int[] phole = new int[range]; 
        Arrays.fill(phole, 0); 
  
        for(i = 0; i<n; i++) 
            phole[arrayToBeSorted[i] - min]++; 
  
          
        index = 0; 
  
        for(j = 0; j<range; j++) 
            while(phole[j]-->0) 
                arrayToBeSorted[index++]=j+min; 
  
    } 
  
    public static void main(String[] args) 
    { 
    	PigeonholeSort m=new PigeonholeSort();
		m.arrayToBeSorted=new int[args.length];
		for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
		m.pigeonholeSort(args.length);
		String output="[";
		for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
		output=output.substring(0,output.length()-1)+"]";
		System.out.println(output);
    } 
  
}