# GCD Finder

## Problem Statement

Given `n` integers, find the **Greatest Common Divisor (GCD)** among them.

##  Input Format

- First line: integer `n` (number of integers).
- Second line: `n` integers separated by space.

## Output Format

- A single integer: the GCD of the given numbers.

---

##  Constraints

- `1 ≤ n ≤ 10^5`
- `1 ≤ arr[i] ≤ 10^9`

---

### Example 1

#### Input:
3<br>
42 56 14<br>

#### Output:
14<br>

---
### Example 2

#### Input:
4<br>
8 16 32 64<br>

#### Output:
8<br>

---
###  Approach

- Use the **Euclidean Algorithm**:
  - `gcd(a, b) = gcd(b, a % b)`

###  Time Complexity:
- **O(n log M)**, where `M` is the largest number in the input list.

---
## Author
- Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)
