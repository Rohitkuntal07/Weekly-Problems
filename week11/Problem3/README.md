# Minimum Broadcast Range for Radio Towers

## Problem Statement
You are the technical director of **WSPT Radio**, responsible for ensuring nationwide listeners can tune in to broadcasts. <br>
Listeners live along a 1D horizontal line ranging from **0 (west) to 1000 (east)**. Several radio towers are already installed at different positions. <br>

To save energy and cost, you want to determine the **minimum range R** each tower must broadcast so that **every listener is covered by at least one tower**. <br>

### Input
- First line: integer `N` – number of listeners <br>
- Second line: `N` space-separated integers – positions of listeners <br>
- Third line: integer `M` – number of towers <br>
- Fourth line: `M` space-separated integers – positions of towers <br>

### Output
- A single integer – the minimum broadcast range required <br>

### Constraints
- 1 ≤ N ≤ 100000 <br>
- 1 ≤ M ≤ 100000 <br>
- 0 ≤ position ≤ 1000 <br>
- Listeners' and towers' positions may overlap <br>
- All inputs are integers <br>

---

## Example

### Input
4<br>
1 5 11 20<br>
3<br>
4 8 15<br>

### Output
5

### Explanation
- Listener at 1 → covered by tower 4 (distance 3) <br>
- Listener at 5 → covered by tower 4 or 8 (distance 1–3) <br>
- Listener at 11 → covered by tower 8 or 15 (distance 3–4) <br>
- Listener at 20 → covered by tower 15 (distance 5) <br>

Minimum required broadcast range = **5** <br>

---
### Author 
Rohit [@Rohitkuntal07](https:github.com/Rohitkuntal07)
