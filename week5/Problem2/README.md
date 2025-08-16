# Flood Fill Algorithm (Java)

## Description

This is a general-purpose implementation of the **Flood Fill** algorithm in Java. It operates on a 2D character matrix and replaces the color of a starting pixel and all connected pixels (4-directionally) that share the same color.

Useful for:
- Image editing simulations
- Maze or territory filling problems
- Connected component identification

---

## Input Format

- A 2D character matrix `image[n][m]` representing the image.
- Integers `sr`, `sc` representing the row and column of the starting pixel.
- A character `newColor` representing the color to fill with.

---

## Output

The input `image` matrix is modified **in place** with the flood-filled region updated to `newColor`.

---

## Example

### Input:

char[][] image = {<br>
    {'B', 'B', 'W'},<br>
    {'W', 'W', 'W'},<br>
    {'W', 'W', 'W'},<br>
    {'B', 'B', 'B'}<br>
};<br>
int sr = 2, sc = 2<br>
C = 'G'<br>

### Output:

[<br>
['B', 'B', 'G'],<br>
['G', 'G', 'G'],<br>
['G', 'G', 'G'],<br>
['B', 'B', 'B']<br>
]<br>

## Approach

We use **Depth-First Search (DFS)** to traverse and modify the image matrix:

1. Record the original color at the starting pixel.
2. If the original color is already the new color, return immediately.
3. Recursively check the 4-directionally adjacent pixels (up, down, left, right).
4. If an adjacent pixel has the same original color, replace it with the new color and continue the DFS from that pixel.
5. This continues until all connected pixels of the same original color are filled.

This approach ensures an efficient traversal and avoids unnecessary processing.

---

## Author 
- Rohit [@Rohitkuntal07](https://github.com/Rohitkuntal07)
int sc = 2;
char newColor = 'G';
