///The Euclidean Algorithm is a method for finding the greatest common divisor of two numbers. 
/// It operates on the principle that the GCD of two numbers remains the same even if the 
/// smaller number is subtracted from the larger number.
public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int a, int b){
            while(a!=0&&b!=0){
                if(a>b)a-=b;
                else b-=a;
            }
            if(a==0)return b;
            else return a;
        }
        public static void main(String args[]){
            int a=greatestCommonDivisor(20,15);
            System.out.println(a);
	}
}
