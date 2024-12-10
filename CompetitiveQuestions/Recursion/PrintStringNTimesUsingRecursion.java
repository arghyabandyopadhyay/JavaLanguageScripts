package Recursion;
public class PrintStringNTimesUsingRecursion {
    public static void print(String s, int n){
        if(n==0)return;
        System.out.println(s);
        print(s,n-1);
    }
    public static void main(String[] args){
        print("arghya",5);
    }
}
