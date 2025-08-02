# Word Search in 2D Matrix 

**Asked By:** Microsoft

## Description

Check if a given word exists in a 2D matrix of uppercase characters, either:

- Left-to-right in any row, or
- Top-to-bottom in any column

## Input Format

- First line: Two integers M and N (matrix dimensions)
- Next M lines: Each line contains N uppercase characters (can be space-separated or continuous)
- Last line: A single string representing the word

## Output Format

- Print `true` if the word is found
- Else print `false`

## Constraints

- 1 ≤ M, N ≤ 100
- Word length ≤ max(M, N)
- All characters are uppercase English letters

## Sample Input

matrix = [ 
 ['F', 'A', 'C', 'I'], 
 ['O', 'B', 'Q', 'P'], 
 ['A', 'N', 'O', 'B'], 
 ['M', 'A', 'S', 'S'] 
] <br>
word = "FOAM"<br>

## Sample Output

True<br>

## Time Complexity

- O(M × N)

## Author

Rohit


