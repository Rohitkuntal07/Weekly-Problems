# Deep Clone a Linked List with Random Pointer

## Problem Statement

You are given a singly linked list where each node contains:

- `val`: An integer value  
- `next`: Pointer to the next node  
- `random`: Pointer to **any** node in the list (or `null`)

Your task is to create a **deep copy** of the list. Each node in the new list should:

- Be a completely new object  
- Have the same `val`  
- Have the correct `next` and `random` pointer relationships  

## Input Format

A `Node` object representing the head of the linked list, where each node is defined as:

## Output Format: 

Return the head of the deep cloned linked list. 

## Example: 
## Input: 
A linked list represented as: <br>
Node1(val=7) → Node2(val=13) → Node3(val=11) → Node4(val=10) → Node5(val=1) <br>
Random pointers:  <br>
Node2.random → Node1  <br>
Node3.random → Node5  <br>
Node4.random → Node3  <br>
Node5.random → Node1  <br>

## Output: 
A deep clone with same structure but different memory references.  <br>

## Approach

HashMap Approach (O(n) time, O(n) space): <br>
Create a clone of each node and store a mapping from original to cloned nodes. Then, set the next and random pointers using the map. This method is simple and easy to implement. <br>

## Author
Rohit[@Rohitkuntal07](https://github.com/Rohitkuntal07)


