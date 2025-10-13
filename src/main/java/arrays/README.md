# 🧮 Arrays – Java DSA Practice

This folder contains all **Array-related problems** solved during my daily DSA preparation in Java.  
Each question is implemented cleanly with validation, consistent naming, and clear problem statements.

---

## 📅 **Day 1 – Arrays (Fundamentals)**

**Concepts Covered:**  
Tracking • Swapping • Comparing

| Q No | Problem | Description | Pattern | Time | Space |
|------|----------|--------------|----------|-------|-------|
| Q01 | Maximum Element in Array | Find the largest element in the array | Tracking | O(n) | O(1) |
| Q02 | Reverse Array Elements | Reverse elements in-place using two-pointer swap | Swapping | O(n) | O(1) |
| Q03 | Check if Array is Sorted | Verify whether array elements are sorted in ascending order | Comparison | O(n) | O(1) |

🧠 **Key Learnings:**
- Basic loop patterns and condition checks
- Two-pointer swapping technique
- Early-exit optimization (for sorted check)
- Handling edge cases and boundaries safely

---

## 📅 **Day 2 – Arrays (More Patterns)**

**Concepts Covered:**  
Tracking • Counting • Aggregation • Validation

| Q No | Problem | Description | Pattern | Time | Space |
|------|----------|--------------|----------|-------|-------|
| Q04 | Minimum Element in Array | Find the smallest element in the array | Tracking | O(n) | O(1) |
| Q05 | Count Even Elements | Count total number of even integers in the array | Counting | O(n) | O(1) |
| Q06 | Sum & Average of Elements | Compute total sum and average value | Aggregation | O(n) | O(1) |
| Q07 | Occurrence of Target Element | Count how many times a specific target number appears | Counting | O(n) | O(1) |

🧠 **Key Learnings:**
- Counting logic with conditional checks
- Using enhanced `for` loops for clarity
- Modularizing validation through helper class
- Type casting for correct average computation
- Introduction to reusable utilities

---

## ⚙️ **Utility File**

**`ArrayUtils.java`**  
A reusable helper class for validating and safely handling arrays across all problems.

```java
public static void validateArray(int[] arr) {
    if (arr == null)
        throw new IllegalArgumentException("Array is null");
    if (arr.length == 0)
        throw new IllegalArgumentException("Array is empty");
    if (arr.length > 100_000)
        throw new IllegalArgumentException("Array is too large to process safely");
}
```
---

## 📅 **Day 3 – Arrays (Advanced Tracking & Shifting)**

**Concepts Covered:**  
Index tracking • Dual-max logic • In-place shifting (two-pointer)

| Q No | Problem | Description | Pattern / Concept | Time | Space |
|------|----------|--------------|-------------------|-------|-------|
| Q08 | Index of Largest Element | Return the index (first occurrence) of the largest value in an array | Single-pass tracking (index + value) | O(n) | O(1) |
| Q09 | Second Largest Element | Find the second distinct largest element in an array | Dual-variable tracking | O(n) | O(1) |
| Q10 | Move Zeros to End | Move all zeros to the end while maintaining order of non-zero elements | Two-pointer shifting (in-place) | O(n) | O(1) |

🧠 **Key Learnings:**
- Using **index-aware tracking** instead of just value comparison.  
- Handling **distinct largest values** with dual variables (`largest`, `secondLargest`).  
- Applying the **two-pointer technique** for in-place transformations.  
- Strengthened understanding of array compaction / stability concepts.

---


