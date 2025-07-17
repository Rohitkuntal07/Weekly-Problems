#  Subarray Sum Equals K

##  Problem Statement

You are analyzing calorie burn data for users of a fitness app.  
Given an array of daily burned calories and a target value `k`, find the number of **continuous subarrays** that sum exactly to `k`.

---

##  Input Format

- An integer `n` — number of days  
- `n` space-separated integers — calories burned each day  
- An integer `k` — target calorie burn

##  Output Format

- A single integer — total number of valid subarrays

---

##  Examples

### Example 1
**Input:**
nums = [1, 1, 1]<br>
k = 2 

**Output:**
2 
---

##  Approaches

### 1. Efficient — Prefix Sum + HashMap

- **Time Complexity:** O(n)  
- **Space Complexity:** O(n)  
- Uses a `HashMap` to track frequency of prefix sums.  
- For each index, it checks if `currentSum - k` has been seen before.

---

### 2. Brute Force — Triple Loop

- **Time Complexity:** O(n³)  
- **Space Complexity:** O(1)  
- Checks all possible subarrays using three nested loops.

##  Author  
Rohit 
GitHub: [@Rohitkuntal07](https://github.com/Rohitkuntal07)
