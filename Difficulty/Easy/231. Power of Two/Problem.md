# 231. Power of Two

## Problem Statement

Given an integer `n`, return **true** if it is a power of two. Otherwise, return **false**.

An integer `n` is a power of two if there exists an integer `x` such that `n == 2^x`.

---

## Examples

### Example 1:
**Input:** `n = 1`  
**Output:** `true`  
**Explanation:** \(2^0 = 1\)

### Example 2:
**Input:** `n = 16`  
**Output:** `true`  
**Explanation:** \(2^4 = 16\)

### Example 3:
**Input:** `n = 3`  
**Output:** `false`  
**Explanation:** 3 is not a power of two.

---

## Explanation

- If `n` is a power of two, its binary form has exactly one `1` and the rest are `0`s.
- For example, `16` in binary is `10000`.
- Subtracting `1` from a power of two flips all bits after the set bit.
- Bitwise AND of `n` and `n-1` will be zero only if `n` is a power of two.

---
