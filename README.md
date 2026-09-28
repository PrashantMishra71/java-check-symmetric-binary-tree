# Check Symmetric Binary Tree

## Problem Statement

Given the root of a binary tree, determine whether the tree is symmetric around its center.

A binary tree is symmetric when its left and right subtrees are mirror images of each other.

## Example

        10
       /  \
      5    5
     / \  / \
    3  7 7  3

Output:

The tree is symmetric

## Approach

Compare the left and right subtrees as mirror images.

For two mirror nodes:

- Both must be `null`, or
- Both must exist and have the same value.
- The left child of one must match the right child of the other.
- The right child of one must match the left child of the other.

## Complexity

- Time: O(n)
- Space: O(h)

Where:
- `n` = number of nodes
- `h` = height of the tree

## Concepts Practiced

- Binary Trees
- Recursion
- Mirror Trees
- DFS
- Tree Comparison