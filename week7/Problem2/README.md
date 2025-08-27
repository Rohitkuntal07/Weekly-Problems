# Alternating Sum – Curried Style Implementation

## Problem Statement
You need to implement a function **`add_subtract`** in Java that works in a **curried style** and alternately **adds** and **subtracts** numbers passed to it.

- The **first number is always added** (starting point).
- The **second number is subtracted**.
- The **third number is added**.
- The **fourth number is subtracted**, and so on, alternating between addition and subtraction.

---

## Examples
| Input | Step-by-step | Output |
|--------|-------------|--------|
| `add_subtract(7)` | 7 | `7` |
| `add_subtract(1)(2)(3)` | 1 + 2 - 3 | `0` |
| `add_subtract(-5)(10)(3)(9)` | -5 + 10 - 3 + 9 | `11` |
| `add_subtract(5)(6)(7)` | 5 + 6 - 7 | `4` |

---

## Input Format
- Sequence of integers passed as **curried arguments**.

## Output Format
- Return a **single integer** representing the alternating sum.

---

## Constraints
- Numbers can be **positive or negative**.
- At least **one number** is always provided.
- Must handle up to **10⁵ chained arguments** efficiently.

---

## Approach
### Chained Object Implementation
- Maintain two variables:
  - `sum` → to store the running total.
  - `addNext` → a boolean flag to decide whether to **add or subtract** the next number.
- Each chained call:
  - Updates the sum.
  - Toggles the flag for the next call.
- Return the object itself to allow chaining.

---

#### Sample Input
add_subtract(5)(6)(7)
#### Output
4  ` Explaination : 5 + 6 - 7 = 4`

---

### Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)

