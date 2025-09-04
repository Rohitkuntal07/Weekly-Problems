# Even Tree

## Problem Statement
You are given a tree with `N` nodes, where `N` is even. Each edge connects two nodes.  
Your task is to remove the maximum number of edges such that every resulting connected component (subtree) has an even number of nodes.

---

### Input Format
- First line: An integer `N` (number of nodes, even).
- Next `N-1` lines: Two integers `u v` denoting an edge between node `u` and node `v`.

### Output Format
- Print the maximum number of edges that can be removed while still ensuring that every resulting subtree has an even number of nodes.

---

### Example
**Input**
8<br>
1 2<br>
1 3<br>
3 4<br>
3 5<br>
4 6<br>
4 7<br>
4 8<br>

**Output**
2

---

### Complexity
- **Time Complexity:** `O(N)`  
- **Space Complexity:** `O(N)`  

---

### Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)
