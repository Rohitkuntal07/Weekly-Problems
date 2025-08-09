# Friend Groups Counter

## Problem Statement
We have `N` students (numbered `0` to `N-1`). Friendships are mutual, and given in the form of an adjacency list.  
We need to find how many **friend groups** (connected components) exist.

---

## Input Format
1. First line: Integer `N` — total number of students.
2. Next `N` lines: Space-separated friend IDs for each student.  
   - Use `-1` if the student has no friends.

---

## Output Format
- A single integer: total number of friend groups.

---

## Example

### Input:
N = 7<br>
friendship = {<br>
 0: [1, 2],<br>
 1: [0, 5],<br>
 2: [0],<br>
 3: [6],<br>
 4: [],<br>
 5: [1],<br>
 6: [3]<br>
}<br>
### Output:
3<br>
### Explanation:
Group 1: {0, 1, 2, 5}<br>
Group 2: {3, 6}<br>
Group 3: {4}<br>

## Approach
- Treat students as nodes and friendships as edges in an **undirected graph**.
- Use BFS or DFS to explore connected components.
- Maintain a `visited` array to track visited students.
- For every unvisited student, start a BFS/DFS and increment the group count.

---

## Author
Rohit [@Rohitkuntal07](https://github.com/Rohitkuntal07)
