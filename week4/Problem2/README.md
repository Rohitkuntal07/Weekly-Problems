# Binary Search Without Division, Multiplication, or Bit-Shift

## Problem Statement
Given:
- A sorted list of integers `arr` of length `N`.
- A target value `x`.

Return **true** if `x` exists in the list, otherwise **false**.

**Restriction:**  
You cannot use:
- Multiplication (`*`)
- Division (`/`)
- Bit-shift (`<<`, `>>`)

---

## Input Format
1. First line: integer `N` (size of the list)
2. Second line: `N` integers (sorted in ascending order)
3. Third line: integer `x` (target value)

---

## Output Format
- `true` if `x` is found
- `false` otherwise

---

## Examples

### Example 1
**Input:**
N = 7<br>
arr = [-5, -2, 0, 3, 7, 10, 15] <br>
x = 7<br>
**Output**
true<br>

## Approach
- Use **Binary Search** to achieve `O(log N)` complexity.
- Since `/`, `*`, and bit-shifts are not allowed:
  - Calculate `mid` as `low + (high - low) // 2`  
  - Implement integer division by 2 manually using repeated subtraction.

---

## Author
Rohit [@Rohitkuntal07](https://github.com/Rohitkuntal07/)
