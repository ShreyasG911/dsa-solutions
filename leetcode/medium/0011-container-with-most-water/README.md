# Container With Most Water

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `ith` line are `(i, 0)` and `(i, height[i])`.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return  *the maximum amount of water a container can store*.

 **Notice**  that you may not slant the container.

 

 **Example 1:** 

```
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

```

 **Example 2:** 

```
Input: height = [1,1]
Output: 1

```

 

 **Constraints:** 

- n == height.length
- 2 <= n <= 105
- 0 <= height[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 94.68%)  
**Memory:** 77.1 MB (beats 85.64%)  
**Submitted:** 2026-07-15T09:28:50.253Z  

```java
class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int vol = 0;
        while(lp<rp){
            
            int ht = height[lp] < height[rp] ? height[lp] : height[rp];
            int w = rp-lp;

            if(vol<ht*w){
                vol = ht*w;
            }

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return vol;

        // while(lp<rp){
        //     int ht = Math.min(height[rp], height[lp]);
        //     int w = rp-lp;
        //     vol = Math.max(vol, ht*w);

        //     if(height[lp]<height[rp]){
        //         lp++;
        //     }else{
        //         rp--;
        //     }
        // }
        // return vol;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/container-with-most-water/)