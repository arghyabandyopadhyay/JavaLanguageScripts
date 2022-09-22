//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
//
//        A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
//
//
//
//
//        Example 1:
//
//        Input: digits = "23"
//        Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
//        Example 2:
//
//        Input: digits = ""
//        Output: []
//        Example 3:
//
//        Input: digits = "2"
//        Output: ["a","b","c"]
//
//
//        Constraints:
//
//        0 <= digits.length <= 4
//        digits[i] is a digit in the range ['2', '9'].
//

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationOfPhone {
    public List<String> letterCombinations(String digits) {
        String[][] digOption={
                {"","",""},
                {"a","b","c"},
                {"d","e","f"},
                {"g","h","i"},
                {"j","k","l"},
                {"m","n","o"},
                {"p","q","r","s"},
                {"t","u","v"},
                {"w","x","y","z"}
        };
        char[] charDigits=digits.toCharArray();
        List<String> res=new LinkedList<>();
        int digit;
        int len=digits.length();
        for(int i=0;i<len;i+=1){
            digit=charDigits[i]-49;
            String[] s=digOption[digit];
            if(res.isEmpty())res.addAll(Arrays.asList(s));
            else{
                List<String> res_temp=new LinkedList<>();
                for(String r:res){
                    for (String value : s) res_temp.add(r + value);
                }
                res=res_temp;
            }
        }
        return res;
    }
}
