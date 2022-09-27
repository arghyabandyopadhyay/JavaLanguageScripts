import java.util.ArrayList;
import java.util.List;

public class ParenthesisGenerator {
    static List<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        solve("",0,0,n);
        return ans;
    }
    private static void solve(String str,int left,int right,int n){
        System.out.println("solve called for : " + str + " left : " + left + " right : " + right);
        if(str.length()==2*n){
            ans.add(str);
        }
        if(left<n){
            String temp1=str;
            temp1+="(";
            solve(temp1,left+1,right,n);
        }
        if(right<left){
            String temp1=str;
            temp1+=")";
            solve(temp1,left,right+1,n);
        }
    }
}
