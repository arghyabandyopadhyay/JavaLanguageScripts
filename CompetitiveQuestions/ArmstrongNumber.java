public class ArmstrongNumber {
    public static boolean isArmstrongNumber(int num){
        int length=(int)Math.floor(Math.log10(num))+1;
        int iterator=num,sum=0;
        while(iterator>0){
            int digit=iterator%10;
            sum+=Math.pow(digit, length);
            iterator/=10;
        }
        return sum==num;
    }
    public void main(String[] args){
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(151));
    }
}
