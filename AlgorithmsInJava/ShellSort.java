class ShellSort 
{ 
    int arrayToBeSorted[];
    void shellSort(int n) 
    { 
        for (int gap = n/2; gap > 0; gap /= 2) 
        {
            for (int i = gap; i < n; i += 1) 
            { 
                int temp = arrayToBeSorted[i]; 
                int j; 
                for (j = i; j >= gap && arrayToBeSorted[j - gap] > temp; j -= gap) 
                    arrayToBeSorted[j] = arrayToBeSorted[j - gap]; 
                arrayToBeSorted[j] = temp; 
            } 
        }
    }
    public static void main(String args[])
    {
        ShellSort m=new ShellSort();
        int len=args.length;
        m.arrayToBeSorted=new int[len];
        for (int j=0;j<args.length;j++)m.arrayToBeSorted[j]=Integer.parseInt(args[j]);
        m.shellSort(len);
        String output="[";
        for (int j=0;j<m.arrayToBeSorted.length;j++)output+=m.arrayToBeSorted[j]+",";
        output=output.substring(0,output.length()-1)+"]";
        System.out.println(output);
    }
}