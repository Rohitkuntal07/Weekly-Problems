# Longest Increasing Subsequence (LIS)

## Problem Statement
Given an array of numbers, find the length of the Longest Increasing Subsequence (LIS).  
The subsequence does not need to be contiguous, but the order must be maintained.<br>

### Example
Input:<br>
[0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15]<br>
Output:<br>
6<br>
Explanation:<br>
The LIS is [0, 2, 6, 9, 11, 15] of length 6.<br>

---

## Approaches

### 1. Recursive + Memoization (Top-Down DP)
- Try including or excluding each element.<br>
- Memoize results to avoid recomputation.<br>

Time Complexity: O(n²)<br>
Space Complexity: O(n²)<br>

### 2. Bottom-Up DP (Classic DP)
- Use an array dp[i] = LIS ending at index i.<br>
- Transition: dp[i] = 1 + max(dp[j]) for all j < i where nums[j] < nums[i].<br>

Time Complexity: O(n²)<br>
Space Complexity: O(n)<br>

### 3. Optimized Approach with Binary Search (Patience Sorting Method)

- Maintain a temp list:<br>
- If current number > largest element → append.<br>
- Else → replace the smallest element ≥ current number.<br>

Time Complexity: O(n log n)<br>
Space Complexity: O(n)<br>

---

### Author
Rohit
