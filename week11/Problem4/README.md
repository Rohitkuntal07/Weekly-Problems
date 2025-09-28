# The 24 Game

## Problem Statement
The **24 Game** is a popular math puzzle. You’re given four integers (1–9) in a fixed order, and you must determine if it’s possible to reach exactly **24** by inserting the operators `+`, `-`, `*`, `/` and grouping with parentheses. <br>
This puzzle tests not only problem-solving but also **recursion** and **backtracking** skills. <br>

### Input
- Four space-separated integers `a1 a2 a3 a4` (each between 1 and 9). <br>

### Output
- Print `true` if 24 can be formed, else `false`. <br>

### Constraints
- Input always contains exactly **4 integers**. <br>
- Each integer lies in the range **1 ≤ ai ≤ 9**. <br>
- Division must be handled as **floating-point** (avoid integer truncation). <br>
- Comparison should allow a small tolerance (e.g., `|value - 24| < 1e-6`). <br>

---

## Examples

### Input
5 2 7 8

### Output
true

### Explanation
One valid expression:  
`(5 × 2 - 7) × 8 = 24` <br>

---

### Input
1 1 1 1

### Output
false
### Explanation
No combination of operations and parentheses can produce 24. <br>

---

### Author
Rohit
