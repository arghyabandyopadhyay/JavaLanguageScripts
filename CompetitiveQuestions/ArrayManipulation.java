// Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.

// Example


// Queries are interpreted as follows:

//     a b k
//     1 5 3
//     4 8 7
//     6 9 1
// Add the values of  between the indices  and  inclusive:

// index->  1 2 3  4  5 6 7 8 9 10
//     [0,0,0, 0, 0,0,0,0,0, 0]
//     [3,3,3, 3, 3,0,0,0,0, 0]
//     [3,3,3,10,10,7,7,7,0, 0]
//     [3,3,3,10,10,8,8,8,1, 0]
// The largest value is  after all operations are performed.

// Function Description

// Complete the function arrayManipulation in the editor below.

// arrayManipulation has the following parameters:

// int n - the number of elements in the array
// int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
// Returns

// int - the maximum value in the resultant array
// Input Format

// The first line contains two space-separated integers  and , the size of the array and the number of operations.
// Each of the next  lines contains three space-separated integers ,  and , the left index, right index and summand.

// Constraints
// Sample Input

// 5 3
// 1 2 100
// 2 5 100
// 3 4 100
// Sample Output

// 200
// Explanation

// After the first update the list is 100 100 0 0 0.
// After the second update list is 100 200 100 100 100.
// After the third update list is 100 200 200 200 100.

// The maximum value is 200.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//class Result {
//
//    /*
//     * Complete the 'arrayManipulation' function below.
//     *
//     * The function is expected to return a LONG_INTEGER.
//     * The function accepts following parameters:
//     *  1. INTEGER n
//     *  2. 2D_INTEGER_ARRAY queries
//     */
//
//
//}

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        Long resultArray[]=new Long[n+1];
        Arrays.fill(resultArray,0l);
        for(List<Integer> query:queries){
            int val=query.get(2);
            resultArray[query.get(0)-1]+=val;
            resultArray[query.get(1)]-=val;
        }
        long sum = 0, res = Integer.MIN_VALUE;
        for (int i = 0; i < n; ++i)
        {
            sum += resultArray[i];
            res = Math.max(res, sum);
        }
        return res;
    }
}

