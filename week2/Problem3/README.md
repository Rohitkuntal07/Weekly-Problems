# Problem of the Week – Step Words Finder

## Problem Description

In a word game, a **step word** is created by:
- Adding **exactly one letter** to a given word
- Anagramming the result to form a **valid dictionary word**

### Example:
From `"apple"`:
- Add `"a"` → `"applea"`
- Anagram → `"appeal"` (valid word) → Step Word

---

## Input Format

- First line: A string `W` (input word)
- Second line: An integer `N` (number of dictionary words)
- Next `N` lines: Each line contains a valid lowercase dictionary word

## Output Format

Print all valid **step words** (one per line) in **lexicographical order**

---

## Constraints

- 1 ≤ |W| ≤ 15
- 1 ≤ N ≤ 100000
- All dictionary words:
  - Are lowercase
  - Contain only alphabetic characters
  - Have no spaces

---

## Sample Input
apple <br>
5 <br>
appeal <br> 
apply <br>
pepla <br>
papple <br>
apples


## Sample Output

appeal <br>
papple


## Explanation

- `appeal` is a step word (add "a" → "applea" → anagram → "appeal")
- `papple` is a step word (add "p" → "applep" → anagram → "papple")
- `apply` is invalid (missing an "e")
- `pepla` is invalid (missing a character)
- `apples` is not a step word by character frequency

---

## Approach

1. **Frequency Count**:
   - Use an array of size 26 to count characters in the input word
2. **For each dictionary word**:
   - Skip if its length is not exactly one more than the input word
   - Compare frequency maps
   - Check if only **one** additional character exists in the dictionary word

### Time Complexity

- **O(N * K)** where:
  - N is number of dictionary words
  - K is max word length (≤ 15)
- Efficient for up to 100,000 words

---

## Author

Rohit(@Rohitkuntal07)
