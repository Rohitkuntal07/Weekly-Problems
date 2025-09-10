# Autocomplete System

##  Problem Statement
Autocomplete is a widely used feature in search engines and applications like Twitter, Google, and IDEs.  
When a user starts typing, the system suggests possible completions based on known query strings.

You are given:
- A query string `s`.
- A set of possible query strings `dict[]`.

Return all strings in `dict` that have `s` as a prefix.

---

###  Input Format
- First line: Integer `N`, number of words in the dictionary.  
- Second line: `N` space-separated strings (the dictionary).  
- Third line: A string `s` (the query prefix).  

### Output Format
- List of strings from the dictionary that start with prefix `s`.

---

###  Sample Input
3<br>
dog deer deal<br>
de<br>
### Sample Output 0
deer deal<br>

---

###  Constraints
- `1 ≤ N ≤ 10^5`  
- Each word length ≤ `50`  
- Query string length ≤ `50`

---


### Author 
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)
