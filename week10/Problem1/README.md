# Knight Probability on Chessboard

## Problem
Given:
- An 8 × 8 chessboard (rows and columns 0..7).
- A starting square `(r, c)`.
- An integer `k` (number of moves).

A knight moves randomly among its 8 possible moves. If a move goes off-board, the knight is lost.  
Return the probability that after exactly `k` moves the knight is still on the board.

---

## Approach
We use **Dynamic Programming** with rolling 2D arrays:
- Let `dp[t][i][j]` = probability of being at `(i,j)` after `t` moves.
- Initialize `dp[0][r][c] = 1`.
- For each step, distribute probabilities equally among valid knight moves.
- Lost moves are ignored (probability mass vanishes).
- The final probability is the sum of all cells after `k` steps.

---

## Example
### Input
0 0 1
### Output
0.250000

---

### Input
0 0 2
### Output
0.187500

---

## Complexity
- **Time:** `O(k * 64 * 8)` ≈ `O(k)`
- **Space:** `O(64)` (two 8×8 boards)

---

### Author 
Rohit
