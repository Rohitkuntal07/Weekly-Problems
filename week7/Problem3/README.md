# Validate Number

##  Problem Description

You’re building an input validator for a form where users can type numbers. The field should accept:

- **Integers** (e.g., `"10"`, `"-10"`)
- **Real numbers with decimals** (e.g., `"10.1"`, `"-10.1"`, `".5"`, `"3."`)
- **Scientific notation** (e.g., `"1e5"`, `"-3.2E-7"`)

It should reject malformed inputs like:
- `"a"`, `"x 1"`, `"a -2"`, `"-"`, `"1e"`, `"e9"`

### **Key Points**
- Optional leading/trailing spaces are allowed, but **internal spaces are not**.
- Optional leading `+` or `-` sign is allowed.
- Scientific notation (`e`/`E`) must be followed by a valid integer (can have optional sign).
- Decimal point `.` can appear **at most once** and **not after `e`/`E`**.

---

##  Input Format
- A **single string** `s`.

##  Output Format
- `true` if the string represents a **valid number**.
- `false` otherwise.

---

##  Constraints
- `1 ≤ len(s) ≤ 10^4`
- Characters allowed: digits `0-9`, signs `+/-`, decimal point `.`, exponent marker `e/E`, and spaces.
- No thousands separators are allowed.

---

##  Examples

| Input        | Output | Explanation |
|--------------|--------|-------------|
| `"10"`       | `true` | Valid positive integer |
| `"-10.1"`    | `true` | Valid signed real number |
| `"1e5"`      | `true` | Valid scientific notation |
| `"a -2"`     | `false`| Contains invalid characters and space in between |
| `" -90e3 "`  | `true` | Trims spaces and parses valid scientific notation |
| `"1e-3"`     | `true` | Exponent with sign |
| `".1"`       | `true` | Fractional number without leading digit |
| `"3."`       | `true` | Trailing dot allowed |
| `"."`        | `false`| Needs at least one digit |
| `"1e"`       | `false`| Missing digits after exponent |
| `"e9"`       | `false`| Missing mantissa before exponent |
| `"-"`        | `false`| Sign alone is invalid |
| `"+"`        | `false`| Sign alone is invalid |
| `" 1 2 "`    | `false`| Internal space is not allowed |

---

##  Approaches

### ** One-pass parser with flags (Recommended)**
- **Steps**:
  1. Trim leading/trailing spaces.
  2. Use flags:
     - `seenDigit` → whether a digit was seen
     - `seenDot` → whether a decimal point was seen
     - `seenExp` → whether `e`/`E` was seen
     - `digitAfterExp` → at least one digit after `e`/`E`
  3. Validate signs, dots, exponents, and digits as you iterate.

- **Time Complexity:** `O(n)`  
- **Space Complexity:** `O(1)`

---

### ** DFA (Finite-State Machine)**
- Build a deterministic finite automaton that validates state transitions.
- More formal and reliable but longer to implement.

---

### Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07/)
