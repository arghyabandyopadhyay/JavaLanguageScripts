// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lowercase English letters.

class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String cp=strs[0];
        for(int i=1;i<strs.length;i++){
            cp=commonPrefix(cp,strs[i]);
            if(cp.length()==0)break;
        }
        return cp;
    }
    public String commonPrefix(String a, String b){
        if(a.length()>b.length()){
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)!=a.charAt(i))
                    return b.substring(0,i);
                
            }
            return b;
        }
        else{
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)!=b.charAt(i))
                    return a.substring(0,i);
            }
            return a;
        }
    }
}
