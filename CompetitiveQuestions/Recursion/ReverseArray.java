package Recursion;
public class ReverseArray {
    public static void reverse(int[] n, int start, int end){
        if(start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            reverse(n, start+1, end-1);
        }
    }
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        reverse(arr, 0, 4);
        printArray(arr, 5);
    }

    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.println("");
     }
}
