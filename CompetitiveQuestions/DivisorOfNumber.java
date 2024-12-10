import java.util.ArrayList;
import java.util.List;

public class DivisorOfNumber {
    public List<Integer> findDivisorOfNumber(int num){
        List<Integer> result=new ArrayList<Integer>();
        int sqrt=(int)Math.sqrt(num);
        for(int i=1;i<=sqrt;i++){
            if(num%i==0){
                result.add(i);
                if(num/i!=i)result.add(num/i);
            }
        }
        return result;
    }
    public void main(String[] args){
        System.out.println(findDivisorOfNumber(52).toString());;
        System.out.println(findDivisorOfNumber(36).toString());;
    }
}
