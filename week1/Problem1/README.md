#  Find Minimum in Rotated Sorted Array

##  Problem Statement

Given an array that was initially sorted in ascending order and then rotated at an unknown pivot, find the **minimum element**.

- The array contains no duplicate elements.
- Time complexity:
  - Binary Search: O(log N)
  - Linear Search: O(N)

---

##  Input Format

- First line: An integer `N` (number of elements in the array)
- Second line: `N` space-separated integers (rotated sorted array)

##  Output Format

- A single integer: the minimum element in the array

---

##  Example

### Input
5
5 7 10 3 4

### Output
3

---

## Approaches

### Binary Search (Efficient)
- File: `MinElementBinary.java`
- Time: O(log N)
- Space: O(1)

### Linear Search (Simple)
- File: `MinElementLinear.java`
- Time: O(N)
- Space: O(1)


---



