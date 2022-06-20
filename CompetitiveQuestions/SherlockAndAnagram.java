import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */
    public static int[] getFreq(char[] str){
        int[] freq=new int[256];
        for(char ch:str)freq[ch]++;
        // for(int i='a';i<='z';i++)System.out.print(freq[i]);
        // System.out.println();
        return freq;
    }
    public static int sherlockAndAnagrams(String s) {
        int result=0;
        // for(int i=1;i<=s.length()/2;i++){
        //     System.out.println("i "+i);
        //     for(int j=0;j<s.length()-i+1;j++){
        //         System.out.println("j "+j);
        //         String temp=s.substring(j,j+i);
        //         int[] tempFreq=getFreq(temp.toCharArray());
        //         String rem=s.substring(j+i);
        //         thisLabel:
        //         for(int k=0;k<rem.length()-i+1;k++){
        //             int[] t=getFreq(rem.substring(k,k+i).toCharArray());
        //             for(int a=0;a<256;a++){
        //                 if(t[a]!=tempFreq[a])continue thisLabel;
        //             }
        //             System.out.println("temp "+temp);
        //             System.out.println("For k "+rem.substring(k,k+i));
        //             result++;
        //         }
        //         System.out.println("Result "+result);  
        //     }
        // }
        int result1=0;
        for(int i=1;i<s.length();i++){
            System.out.println("i "+i);
            for(int j=0;j<s.length()-i+1;j++){
                System.out.println("j "+j);
                String temp=s.substring(j,j+i);
                int[] tempFreq=getFreq(temp.toCharArray());
                thisLabel:
                for(int k=0;k<s.length()-i+1;k++){
                    int[] t=getFreq(s.substring(k,k+i).toCharArray());
                    for(int a=0;a<256;a++){
                        if(t[a]!=tempFreq[a])continue thisLabel;
                    }
                    if(!s.substring(k,k+i).equals(temp)){
                        System.out.println("temp "+temp);
                        System.out.println("For k "+s.substring(k,k+i));
                        result1++;
                        }
                    } 
                    System.out.println("Result1 "+result1);            
                }
            }
            return result1;

        }
    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            for (int qItr = 0; qItr < q; qItr++) {
                String s = bufferedReader.readLine();

                int result = Result.sherlockAndAnagrams(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


}

