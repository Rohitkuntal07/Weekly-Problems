# Ruby Second House

##  Problem Description

You are a construction manager overseeing the painting of a row of `n` houses. Each house must be painted using one of `k` available colors. Painting each house with a particular color has a specific cost associated with it.

Your goal is to **minimize the total painting cost**, under the following condition:

- **No two adjacent houses can be painted with the same color.**

You are given a 2D array `costs` where `costs[i][j]` represents the cost of painting the `i-th` house with the `j-th` color.

---

##  Input Format

- `n` — number of houses (1 ≤ n ≤ 100)  
- `k` — number of colors (2 ≤ k ≤ 20)  
- Each cost value: (1 ≤ cost[i][j] ≤ 20)

---

##  Output

A single integer: the **minimum total painting cost** such that no two adjacent houses have the same color.

---

##  Example

### Input
2 3<br>
1 5 3<br>
2 9 4

### Output
5

It's an efficient O(n * k) solution using dynamic programming with two-minimum tracking to avoid adjacent color repetition.

## Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)



