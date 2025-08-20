# Misère Nim (3 Heaps)

## Problem
Two players take turns removing stones from one heap. In **misère Nim**, the player who takes the last stone loses.  
Given 3 heaps `[a, b, c]`, decide if the first player can force a win.

## Rules
- If all heaps are `1`:
  - Win if number of heaps is even.
  - Lose if odd.
- Otherwise:
  - Compute `a ^ b ^ c` (nim-sum).
  - Win if nim-sum ≠ 0, else lose.

## Examples
- `[3, 4, 5] → True`
- `[1, 1, 1] → False`
- `[1, 1, 2] → True`

## Complexity
- Time: `O(1)`  
- Space: `O(1)`

---

### Author 
- Rohit
