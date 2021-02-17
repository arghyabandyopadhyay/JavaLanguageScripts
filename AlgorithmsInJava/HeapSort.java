//javac HeapSort.java for compiling the code
//java HeapSort {12,11,13,5,6,7} for running the class file
public class HeapSort {
    int arrayToBeSorted[];
    public void heapSort()
    {
        int n = arrayToBeSorted.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arrayToBeSorted[0];
            arrayToBeSorted[0] = arrayToBeSorted[i];
            arrayToBeSorted[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arrayToBeSorted[]. n is size of heap
    void heapify(int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arrayToBeSorted[l] > arrayToBeSorted[largest])
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arrayToBeSorted[r] > arrayToBeSorted[largest])
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            int swap = arrayToBeSorted[i];
            arrayToBeSorted[i] = arrayToBeSorted[largest];
            arrayToBeSorted[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(n, largest);
        }
    }
 
    /* A utility function to print array of size n */
    void printArray()
    {
        int n = arrayToBeSorted.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arrayToBeSorted[i] + " ");
        System.out.println();
    }
 
    // Driver code
    public static void main(String args[])
    {
        HeapSort ob = new HeapSort();
        ob.arrayToBeSorted=new int[args.length];
        for (int j=0;j<args.length;j++)ob.arrayToBeSorted[j]=Integer.parseInt(args[j]);
        int n = ob.arrayToBeSorted.length;
 
        ob.heapSort();
 
        System.out.println("Sorted array is");
        ob.printArray();
    }
}