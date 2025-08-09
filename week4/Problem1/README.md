# First Recurring Character Finder

## Problem Statement
Given a string `s`, return the **first character that appears more than once**, based on the earliest second occurrence.
If no such character exists, return `null`.

---

## Input Format
- A single string `s` consisting of lowercase and/or uppercase English letters.

## Output Format
- Return the first recurring character as a single character string.
- Return `null` if no character repeats.

---

## Examples

### Example 1
**Input:**  
"acbbac"<br>
**Output:**  
"b"<br>
### Example 2
**Input:**  
"abcdef"<br>
**Output:**  
null <br>
### Example 3
**Input:**  
"abca"<br>
**Output:**  
"a"<br>

## Approach
- Use a **HashSet** to store characters that have been seen.
- Traverse the string from left to right.
- As soon as a character is found in the set, print it and stop.
- If no character repeats, print `null`.

---

## Author
Rohit [@Rohitkuntal07](https://github.com/Rohitkuntal07)
