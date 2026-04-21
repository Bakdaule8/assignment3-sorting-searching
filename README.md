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

| Size | Bubble Sort | Merge Sort | Binary Search |
|------|------------|-----------|---------------|
| 10   | 8900       | 13100     | 2800          |
| 100  | 217300     | 68900     | 1500          |
| 1000 | 5507900    | 239800    | 1200          |

---

## Analysis

- Merge Sort performs faster than Bubble Sort for larger arrays.
- Bubble Sort becomes very slow as the size increases.
- Binary Search is the fastest because it reduces the search space quickly.
- Sorted arrays improve performance for some algorithms.
- The results match expected Big-O complexities.

---

## Why Binary Search Requires Sorted Array

Binary Search works by dividing the array into halves. If the array is not sorted, it cannot correctly determine which half to discard.

---

## Reflection

This project helped me understand the difference between simple and advanced algorithms. I learned that theoretical complexity (Big-O) matches real performance in most cases. Implementing algorithms improved my coding and problem-solving skills.

---

## Screenshots

See `/docs/Новая папка` folder.
