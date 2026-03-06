# Diagonal Difference (HackerRank)

## Problem

Given a square matrix, calculate the **absolute difference between the sums of its diagonals**.

## Example

Matrix:

11 2 4
4 5 6
10 8 -12

Primary diagonal sum:

11 + 5 + (-12) = 4

Secondary diagonal sum:

4 + 5 + 10 = 19

Absolute difference:

|4 - 19| = **15**

## Approach

1. Traverse the matrix using a loop.
2. Add elements of the primary diagonal (i,i).
3. Add elements of the secondary diagonal (i,n-i-1).
4. Return the absolute difference using `Math.abs()`.

## Language

Java

## File

solution.java
