# Merge Two Sorted Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given the heads of two sorted linked lists `list1` and `list2`.

Merge the two lists into one  **sorted**  list. The list should be made by splicing together the nodes of the first two lists.

Return  *the head of the merged linked list*.

 

 **Example 1:** 

```
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

```

 **Example 2:** 

```
Input: list1 = [], list2 = []
Output: []

```

 **Example 3:** 

```
Input: list1 = [], list2 = [0]
Output: [0]

```

 

 **Constraints:** 

- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 44 MB (beats 88.61%)  
**Submitted:** 2026-07-14T08:56:33.529Z  

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode newHead = new ListNode(-1);
        ListNode curr = newHead;
        while(temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                curr.next = temp1;
                temp1 = temp1.next;
                curr = curr.next;
            }else{
                curr.next = temp2;
                temp2 = temp2.next;
                curr = curr.next;
            }
        }
        while(temp1!=null){
            curr.next = temp1;
            temp1 = temp1.next;
            curr = curr.next;
        }
        while(temp2!=null){
            curr.next = temp2;
            temp2 = temp2.next;
            curr = curr.next;
        }
        return newHead.next;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/merge-two-sorted-lists/)