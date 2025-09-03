# Reverse Words with Delimiters

##  Problem Statement
You are given a string `S` consisting of **words** and **delimiters**.  
Your task is to **reverse the order of the words** in the string while **keeping the relative order of the delimiters intact**.

### Example
| Input | Output |
|--------|--------|
| `"hello/world:here"` | `"here/world:hello"` |
| `"hello/world:here/"` | `"here/world:hello/"` |
| `"hello//world:here"` | `"here//world:hello"` |

---

## Constraints
- The string may contain multiple types of delimiters (`/`, `:`, etc.).
- Words consist only of lowercase English alphabets.
- Delimiters should remain in their original relative positions.
- Input length can be up to `10^5`.

---
## Approaches
1. Split + Reconstruct (Simple)
- Use regex or manual parsing to separate words and delimiters.
- Reverse only the words.
- Rebuild the string by placing reversed words back with original delimiters.
2. Two-Pointer Approach
- Traverse string and identify words.
- Collect delimiters as they appear.
- Reverse the list of words and merge with delimiters list.
3. Stack-based Approach
- Push all words into a stack.
- Traverse the string again, placing delimiters as-is and popping words from
stack in reverse order.

---

### Author
Rohit
