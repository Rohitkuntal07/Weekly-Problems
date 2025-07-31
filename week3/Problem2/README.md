# Count Unival Subtrees

**Asked By**: Google  
**Topic**: Binary Tree, Recursion

## Problem Description

A unival (universal value) subtree is a subtree where all nodes have the same value.  
Given the root of a binary tree, count the number of unival subtrees.

A single node is considered a unival subtree.

## Input Format

- A binary tree where each node contains an integer and left/right children.

## Output Format

- Return the number of unival subtrees as an integer.

## Constraints

- Number of nodes ≤ 1000  
- Node values can be any integer

## Example

## Input
 0 <br>
 / \ <br>
 1 0 <br>
 / \ <br>
 1 0 <br>
 / \ <br>
 1 1 <br>

## Output
5 <br>

## Approach

Use post-order traversal to:
- Check if left and right subtrees are unival.
- Verify if current node's value matches its children.
- Increment a counter for each unival subtree.

## Time Complexity

- Time: O(N)  
- Space: O(H), H is tree height

## Author

Rohit
