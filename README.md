# Sorting and Searching Algorithm Analysis

## Project Overview
This project compares the performance of different sorting and searching algorithms using Java. The goal is to analyze execution time and understand algorithm efficiency.

---

## Algorithms Used

### 1. Bubble Sort
A simple sorting algorithm that repeatedly swaps adjacent elements if they are in the wrong order.

- Time Complexity: O(n^2)

---

### 2. Merge Sort
An advanced sorting algorithm using divide and conquer strategy.

- Time Complexity: O(n log n)

---

### 3. Binary Search
Searches for an element in a sorted array by repeatedly dividing the search interval in half.

- Time Complexity: O(log n)

---

## Experimental Results

## Experimental Results

| Size | Bubble (Random) | Bubble (Sorted) | Merge Sort | Binary Search |
|------|----------------|-----------------|------------|---------------|
| 10   | 7100           | 2100            | 10700      | 3300          |
| 100  | 204400         | 123600          | 87900      | 1700          |
| 1000 | 4284500        | 2021600         | 201700     | 2100          |

---

## Analysis

- Merge Sort performs significantly faster than Bubble Sort for medium and large arrays due to its O(n log n) complexity.
- Bubble Sort becomes extremely slow as input size increases because it has O(n²) complexity.
- Bubble Sort runs faster on sorted arrays compared to random arrays because fewer swaps are required.
- However, even in sorted cases, Bubble Sort is still slower than Merge Sort for large inputs.
- Binary Search is the fastest algorithm because it reduces the search space by half each step (O(log n)).
- As input size increases, Binary Search time remains almost constant compared to sorting algorithms.
- The experimental results match the expected Big-O theoretical complexities.
---

## Why Binary Search Requires Sorted Array

Binary Search works by dividing the array into halves. If the array is not sorted, it cannot correctly determine which half to discard.

---

## Reflection

This project helped me understand the difference between simple and advanced algorithms. I learned that theoretical complexity (Big-O) matches real performance in most cases. Implementing algorithms improved my coding and problem-solving skills.

---

## Screenshots

See `/docs/Новая папка` folder.
