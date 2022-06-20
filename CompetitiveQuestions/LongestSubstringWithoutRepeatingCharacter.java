import java.util.Arrays;

class LongestSubstringWithoutRepeatingCharacter {
    static final int NoOfChars=256;
    public int lengthOfLongestSubstring(String s) {
        int length=s.length();
        int res=0;
        //last index of all characters is initials as -1
        int[] lastIndex=new int[NoOfChars];
        Arrays.fill(lastIndex,-1);
        //Initialize start of current window
        int i=0;
        //Move end of current window
        for(int j=0;j<length;j++){
            //Find the last index of s[j]
            //Update i(starting index of current windows)
            //as maximum of current value of i and last index plus 1
            i=Math.max(i,lastIndex[s.charAt(j)]+1);
            //update result if we get a larger window
            res=Math.max(res,j-i+1);
            //update last index of j.
            lastIndex[s.charAt(j)]=j;
        }
        return res;
    }
    public static void main(String[] args){
        LongestSubstringWithoutRepeatingCharacter l=new LongestSubstringWithoutRepeatingCharacter();
        int res=l.lengthOfLongestSubstring("arghya");
        System.out.println(res);
    }
}