# Prime Duplicates Finder

## Problem Description
In data processing, we often need to extract numbers that occur frequently and have special mathematical properties.  
This program takes an array of integers and **finds all prime numbers that occur more than once**.  

- If **no prime number repeats**, it returns `-1`.
- The **order of elements** in the output follows their **first appearance** in the input.

---

## Approaches

### ** Optimized Approach (Used in Code)**
- **Steps:**
  1. Traverse the array once.
  2. Use a `LinkedHashMap` to store **frequency of each prime number** while maintaining insertion order.
  3. After the frequency map is built, iterate through it to collect primes with count > 1.
- **Prime check:** Efficient trial division up to `√n`.
- **Time Complexity:**  
  - Building frequency map: `O(N * √M)` (where `M` is max absolute value in array, up to `10^6`)
  - Collecting duplicates: `O(N)`
- **Space Complexity:** `O(N)` for the frequency map.

---


##  Input Format
- **First line:** An integer `N` (size of array)
- **Second line:** `N` space-separated integers (array elements)

---

##  Output Format
- Space-separated list of prime numbers that appear more than once, in the order of their first occurrence.
- Print `-1` if no prime numbers repeat.

---

##  Sample Test Cases

### **Example 1**
**Input**
10<br>
2 3 5 7 11 3 2 15 17 5<br>
**Output**
2 3 5<br>

### **Example 2**
**Input**
6<br>
4 6 8 9 10 12<br>
**Output**
-1<br>

##  Constraints
| Parameter | Value |
|------------|-------|
| Array size (N) | `1 ≤ N ≤ 100000` |
| Array element (A[i]) | `-1000000 ≤ A[i] ≤ 1000000` |
| Prime consideration | Only numbers **greater than 1** are checked for primality |

---

### Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07/)
