# Fixed Point in a Sorted Array <br><br>

## Problem Statement <br>
In algorithmic problem solving, a **fixed point** in an array is an index `i` such that: <br>
arr[i] == i <br><br>
You are given a sorted array of distinct integers, and you need to determine if such a fixed point exists. <br><br>

## Input Format <br>
- First line: integer **N** – size of the array <br>
- Second line: **N** space-separated integers (sorted, distinct) <br><br>

## Output Format <br>
- Print the fixed point if it exists <br>
- Otherwise, print **False** <br><br>

---

## Constraints <br>
- 1 ≤ N ≤ 10^5 <br>
- Array elements can be negative, zero, or positive <br>
- Elements are distinct and sorted in increasing order <br><br>

---

## Examples <br>

### Example 1
**Input**<br>
4 <br>
-6 0 2 40 <br>
**Output** <br>
2 <br>
Explanation: At index 2, `arr[2] = 2`. <br>

---
### Example 2 
**Input**<br>
4 <br>
1 5 7 8 <br>
**Output** <br>
False <br>

---
### Author
Rohit
