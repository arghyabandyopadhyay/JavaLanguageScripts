//Given two binary strings a and b, return their sum as a binary string.
//
//
//
//        Example 1:
//
//        Input: a = "11", b = "1"
//        Output: "100"
//        Example 2:
//
//        Input: a = "1010", b = "1011"
//        Output: "10101"
//
//
//        Constraints:
//
//        1 <= a.length, b.length <= 104
//        a and b consist only of '0' or '1' characters.
//        Each string does not contain leading zeros except for the zero itself.
public class AddBinary {
    public String addBinary(String a, String b) {
        int la=a.length();
        int lb=b.length();
        StringBuilder res=new StringBuilder("");
        if(la>lb){
            int i=lb-1;
            int carry=0;
            while(i>=0){
                int ia=a.charAt(la-(lb-i-1)-1)-48;
                int ib=b.charAt(i)-48;
                int r=ia+ib+carry;
                carry=r>1?1:0;
                res.insert(0,(r%2));
                i--;
            }
            i=la-lb-1;
            while(i>=0){
                int ia=a.charAt(i)-48;
                int r=ia+carry;
                carry=r>1?1:0;
                res.insert(0,(r%2));
                i--;
            }
            if(carry!=0)res=res.insert(0,carry);
        }
        else{
            int i=la-1;
            int carry=0;
            while(i>=0){
                int ib=b.charAt(lb-(la-i-1)-1)-48;
                int ia=a.charAt(i)-48;
                int r=ia+ib+carry;
                carry=r>1?1:0;
                res.insert(0,(r%2));
                i--;
            }
            i=lb-la-1;
            while(i>=0){
                int ib=b.charAt(i)-48;
                int r=ib+carry;
                carry=r>1?1:0;
                res.insert(0,(r%2));
                i--;
            }
            if(carry!=0)res=res.insert(0,carry);
        }
        return res.toString();
    }
}
