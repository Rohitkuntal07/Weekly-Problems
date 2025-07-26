# Problem of the Week – Longest Common Subsequence of Three Strings

## Problem Description

In many real-world applications like version control, spell checking, or DNA sequencing, comparing multiple strings and identifying common patterns is crucial.

This challenge requires computing the **length** of the longest common subsequence (LCS) among three strings.

A **subsequence** is a sequence that appears in the same relative order, but not necessarily contiguous.

### Example:
In `"abcde"` and `"ace"`, the subsequence `"ace"` is valid.

---

## Input Format

Three lines of input:
- First line: S1 (string 1)
- Second line: S2 (string 2)
- Third line: S3 (string 3)

## Output Format

A single integer — the length of the longest common subsequence among the three strings.

---

## Constraints

- 1 ≤ |S1|, |S2|, |S3| ≤ 100
- Strings may contain both lowercase and uppercase English letters

---

## Sample Input

epidemiologist 
refrigeration 
supercalifragilisticexpialodocious


## Sample Output

5


## Explanation

The longest common subsequence among the three strings is `"eieio"` which has a length of 5.

---

## Approach

This problem is solved using **Dynamic Programming with a 3D table**:

- Let `dp[i][j][k]` store the LCS length of:
  - First `i` characters of S1
  - First `j` characters of S2
  - First `k` characters of S3

### Transition:

- If `S1[i-1] == S2[j-1] == S3[k-1]`:
  - `dp[i][j][k] = 1 + dp[i-1][j-1][k-1]`
- Else:
  - `dp[i][j][k] = max(dp[i-1][j][k], dp[i][j-1][k], dp[i][j][k-1])`

### Time Complexity

- `O(N^3)` where `N` is the maximum length of the three strings
- Efficient for inputs up to length 100

---

## Author

Rohit(@Rohitkuntal07)[https://github.com/Rohitkuntal07]
