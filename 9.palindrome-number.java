/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int currentData = x;
        int reverseData = 0;
        while (x > 0) {
            int reminderData = x % 10;
            reverseData = (reverseData * 10) + reminderData;
            x = x / 10;

        }
        return currentData == reverseData;
    }
}
// @lc code=end

