# First Missing Positive

## Problem Statement
Given an unsorted array of integers, find the smallest positive integer that is not present in the array. You must solve this in linear time, $O(n)$, and constant extra space, $O(1)$, by modifying the input array in-place. The array may contain duplicates and negative numbers.

---
### Examples

#### Example 1: <br>

**Input:**
 `[3, 4, -1, 1]`<br>
**Output:**
 `2`<br>
**Explanation:**
`The smallest positive integers are 1, 2, 3, 4... The number 2 is the first one missing from the array.`<br>

---
#### Example 2:<br>

**Input:**
 `[1, 2, 0]`<br>
 **Output:**
 `3`<br>
 **Explanation:**
`The smallest positive integers 1 and 2 are present. The first one missing is 3.`<br>

---
#### Input Format:
- An array of integers.<br>
- The array may contain up to $10^5$ elements.`<br>

#### Output Format:
- Return the smallest positive integer that is missing from the array.

---
##### Constraints:<br>

- $1 \le N \le 10^5$ <br>
- $-10^9 \le arr[i] \le 10^9$

---
### Author
Rohit
