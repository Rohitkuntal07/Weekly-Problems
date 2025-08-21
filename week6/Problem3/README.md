# Maximum Path Sum Between Any Two Nodes in a Binary Tree

## Problem Statement
Given a binary tree where each node contains an integer value, find the maximum path sum between any two nodes.  
The path must include at least one node and does not need to pass through the root.

---

## Example
**Input Tree:**
```text
       -10
       /  \
      9    20
          /  \
         15   7
```

**Output:**  
42<br>

Path: `15 → 20 → 7` with a sum of `42`.

---
## Approach
- Use post-order traversal.
- At each node, calculate:
  - Maximum path sum including one child.
  - Path sum including both children.
- Keep track of the global maximum sum.

## Complexity
- Time: `O(N)` where N is the number of nodes.
- Space: `O(H)` where H is the height of the tree.

---

### Author 
Rohit : [@Rohitkuntal07](https://github.com/Rohitkuntal07)
