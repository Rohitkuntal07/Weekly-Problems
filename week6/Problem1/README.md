# Minimum Number of Perfect Squares

## Problem Description
You are given a positive integer `n`. Your task is to determine the **smallest number of perfect square numbers** that sum exactly to `n`.

A **perfect square** is an integer that is the square of another integer (e.g., 1, 4, 9, 16, ...).  
You may use the same perfect square multiple times if necessary.

---

## Scenario
Imagine you are a cashier, but your coins only have values equal to perfect squares (1, 4, 9, 16, ...).  
You must give change for an amount `n` using the fewest coins possible.  
The goal is to calculate the **minimum number of coins required**.

---

## Input Format
- A single integer `n` (1 ≤ n ≤ 10⁴)

## Output Format
- A single integer — the minimum number of perfect squares whose sum equals `n`.

---

## Constraints
- 1 ≤ n ≤ 10⁴  
- You can use any perfect square as many times as needed.

---

## Examples

### Example 1
**Input:**
13<br>

**Output:**
2<br>

**Explanation:**  
13 = 9 (3²) + 4 (2²) → 2 perfect squares.

---

### Example 2
**Input:**
27

**Output:**
3

**Explanation:**  
27 = 9 + 9 + 9 → 3 perfect squares.

---

## Approach
This problem can be solved using **Dynamic Programming** (similar to the Coin Change problem):
- Compute the minimum number of perfect squares required for each value from `1` to `n`.
- Use previously computed results to build the answer for larger numbers.

Time Complexity: **O(n * sqrt(n))**  
Space Complexity: **O(n)**

---

## Author
Rohit

