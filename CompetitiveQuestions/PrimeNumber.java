public class PrimeNumber {
    public static boolean isPrime(int num){
        int sqrt=(int)Math.sqrt(num);
        for(int i=2;i<sqrt;i++){
            if(num%i==0)return false;
        }
        return true;
    }
    public void main(String[] args){
        System.out.println(isPrime(45));
        System.out.println(isPrime(3));
    }
}
