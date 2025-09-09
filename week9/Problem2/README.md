# Swap Even and Odd Bits 

## Problem Statement
In computer systems, efficient bitwise operations are widely used in networking, cryptography, and compression algorithms.  

You are given an **unsigned 8-bit integer**, and your task is to **swap every even-positioned bit with the adjacent odd-positioned bit**.

- Bits are counted from the right, starting at position **1**.  

### Example
- `10101010 → 01010101`  
- `11100010 → 11010001`  

---

## Input Format
- A single integer `n` (0 ≤ n ≤ 255).  

## Output Format
- An integer after swapping even and odd bits.  

---

## Sample Test Cases

### Sample Input 0
170

### Sample Output 0
85


**Explanation:**  
Binary of `170 = 10101010`.  
Swapping even/odd bits → `01010101 = 85`.  

---

### Sample Input 1
226
### Sample Output 1
209


**Explanation:**  
Binary of `226 = 11100010`.  
Swapping even/odd bits → `11010001 = 209`.  

---

## Approaches

### 1. Brute Force Bit-by-Bit Swap
- Loop through all 8 bits.  
- For each pair `(i, i+1)`, swap values.  
- Time complexity: **O(8) = O(1)** (constant).  

### 2. Efficient Bitmasking (One-Line Solution)
- Use masks to separate even and odd bits:  
  - **Even bit mask** → `0xAA = 10101010`  
  - **Odd bit mask** → `0x55 = 01010101`  
- Shift and combine:

---
### Author
Rohit [@Rohitkuntal07](https:github.com/Rohitkuntal07)
