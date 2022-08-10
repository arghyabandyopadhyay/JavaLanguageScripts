//Given a non-negative integer x, compute and return the square root of x.
//
//        Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//        Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
//
//
//
//        Example 1:
//
//        Input: x = 4
//        Output: 2
//        Example 2:
//
//        Input: x = 8
//        Output: 2
//        Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
//
//
//        Constraints:
//
//        0 <= x <= 231 - 1
public class Sqrt {
    static final int INFINITY_ =9999999;
    public int mySqrt(int x) {
        int i = 0;//Stores the number of segements
        int udigit, j; // Counters
        int cur_divisor = 0;
        int quotient_units_digit = 0;
        int cur_quotient = 0;
        int cur_dividend = 0;
        int cur_remainder = 0;
        //Contains the number in two digit segments
        int[] segments = new int[10];

        // Dividing the number into two digit segments
        while (x > 0) {
            segments[i] = x % 100;
            x = x / 100;
            i++;
        }

        // Last index of the array of segments
        i--;

        // Start long division from the last segment(j=i)
        for (j = i; j >= 0; j--) {

            // Initialising the remainder to the maximum value
            cur_remainder = INFINITY_;
            // Including the next segment in new dividend
            cur_dividend = cur_dividend * 100 + segments[j];

            // Loop to check for the perfect square
            // closest to each segment
            for (udigit = 0; udigit <= 9; udigit++) {

                // This condition is to find the
                // divisor after adding a digit
                // in the range 0 to 9
                int i1 = cur_dividend - ((cur_divisor * 10 + udigit)* udigit);
                if (cur_remainder >= i1 && i1>= 0) {
                    // Calculating the remainder
                    cur_remainder = i1;
                    // Updating the units digit of the quotient
                    quotient_units_digit = udigit;
                }
            }

            // Adding units digit to the quotient
            cur_quotient = cur_quotient * 10 + quotient_units_digit;

            // New divisor is two times quotient
            cur_divisor = cur_quotient * 2;

            // Including the remainder in new dividend
            cur_dividend = cur_remainder;
        }

        return cur_quotient;
    }
}
