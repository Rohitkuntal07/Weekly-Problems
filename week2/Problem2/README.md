# Problem of the Week – Smallest Non-Representable Sum

## Problem Description

In a secure digital wallet system, each user has a set of coin denominations (represented as a sorted array of positive integers). 

For internal validation, we must determine the **smallest amount of money that cannot be formed** using any subset of the given denominations.

This helps identify missing denominations and optimize wallet design.

---

## Input Format

A single line containing space-separated **sorted** positive integers:

## Output Format

A single integer — the **smallest positive integer** that **cannot** be formed as the sum of any subset of the input array.

---

## Constraints

- 1 ≤ N ≤ 10⁵
- 1 ≤ a[i] ≤ 10⁹
- Input array is sorted in increasing order
- All elements are positive integers

---

## Sample Input

1 2 3 10 


## Sample Output

7


## Explanation

Given the array `[1, 2, 3, 10]`, we can form:

- 1, 2, 3
- 1+2=3
- 1+3=4
- 2+3=5
- 1+2+3=6

But we cannot form **7**, making it the smallest non-representable value.

---

## Approach

### Greedy Strategy

Start with the smallest number that cannot be formed yet (`res = 1`):

- For each coin `a[i]`:
  - If `a[i] > res`, then `res` is the answer.
  - Otherwise, add `a[i]` to `res`.

The algorithm **extends the range of constructible sums** as long as no gap is found.

### Time Complexity

- **O(N)** — Single pass through the array
- **O(1)** extra space

This greedy method is optimal and handles large inputs efficiently.

---

## Author

Rohit(@Rohitkuntal07)
