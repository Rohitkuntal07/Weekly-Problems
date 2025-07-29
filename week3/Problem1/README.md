# Equal Sum Partition

## Problem Statement

You are given a multiset (a list that can have duplicate integers). Determine whether it can be partitioned into two subsets such that the sum of elements in both subsets is equal.

This is a variation of the classic **Partition Equal Subset Sum** problem.

---

## Examples

### Example 1:
**Input:**  
`[15, 5, 20, 10, 35, 15, 10]`  
**Output:**  
`true`  
**Explanation:**  
Subset 1: [15, 5, 10, 15, 10] → Sum = 55  <br>
Subset 2: [20, 35] → Sum = 55  

### Example 2:
**Input:**  
`[15, 5, 20, 10, 35]`  
**Output:**  
`false`  
**Explanation:**  
Total sum = 85 → Cannot be equally split into two parts.

---

## Input Format

- A list of integers (can include duplicates).  
- The list may contain up to 100 elements.

## Output Format

- Return `true` if the set can be partitioned into two subsets with equal sum, else return `false`.

---

## Author 
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07/)
