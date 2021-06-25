public class BitonicSort 
{ 
    int arrayToBeSorted[];
    /* The parameter dir indicates the sorting direction, 
       ASCENDING or DESCENDING; if (a[i] > a[j]) agrees 
       with the direction, then a[i] and a[j] are 
       interchanged. */
    void compAndSwap(int i, int j, int dir) 
    { 
        if ( (arrayToBeSorted[i] > arrayToBeSorted[j] && dir == 1) || 
             (arrayToBeSorted[i] < arrayToBeSorted[j] && dir == 0)) 
        { 
            // Swapping elements 
            int temp = arrayToBeSorted[i]; 
            arrayToBeSorted[i] = arrayToBeSorted[j]; 
            arrayToBeSorted[j] = temp; 
        } 
    } 
  
    /* It recursively sorts a bitonic sequence in ascending 
       order, if dir = 1, and in descending order otherwise 
       (means dir=0). The sequence to be sorted starts at 
       index position low, the parameter cnt is the number 
       of elements to be sorted.*/
    void bitonicMerge(int low, int cnt, int dir) 
    { 
        if (cnt>1) 
        { 
            int k = cnt/2; 
            for (int i=low; i<low+k; i++) 
                compAndSwap(i, i+k, dir); 
            bitonicMerge(low, k, dir); 
            bitonicMerge(low+k, k, dir); 
        } 
    } 
  
    /* This funcion first produces a bitonic sequence by 
       recursively sorting its two halves in opposite sorting 
       orders, and then  calls bitonicMerge to make them in 
       the same order */
    void bitonicSort(int low, int cnt, int dir) 
    { 
        if (cnt>1) 
        { 
            int k = cnt/2; 
  
            // sort in ascending order since dir here is 1 
            bitonicSort(low, k, 1); 
  
            // sort in descending order since dir here is 0 
            bitonicSort(low+k, k, 0); 
  
            // Will merge wole sequence in ascending order 
            // since dir=1. 
            bitonicMerge(low, cnt, dir); 
        } 
    } 

    public static void main(String args[])
    {
        BitonicSort m=new BitonicSort();
        int up = 1; 
        m.arrayToBeSorted=new int[args.length];
        for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
        m.bitonicSort(0, args.length, up);
        String output="[";
        for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
        output=output.substring(0,output.length()-1)+"]";
        System.out.println(output);
    }
} 