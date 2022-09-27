public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        char[] ch=s.toCharArray();
        if (ch.length <= 1)
            return 0;

        // Initialize curMax to zero
        int curMax = 0;
        int[] longest = new int[ch.length];

        // Iterate over the String starting from second index
        for (int i = 1; i < ch.length; i++)
        {
            if (ch[i] == ')' && i - longest[i - 1] - 1 >= 0
                    && ch[i - longest[i - 1] - 1] == '(')
            {
                longest[i]
                        = longest[i - 1] + 2
                        + ((i - longest[i - 1] - 2 >= 0)
                        ? longest[i - longest[i - 1] - 2]
                        : 0);
                curMax = Math.max(longest[i], curMax);
            }
        }
        return curMax;
    }
}
