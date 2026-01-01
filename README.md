# Just doing these to give some work to my brain 🧠 😁
# Summary 

* 📆 Day1 - Implemented a simple LRU CACHE with HASHMAP and doubly linked list
* 📆 Day2 - Subarrays whose sum equlas k in brute force approach
* 📆 Day3 - Count of divisors
  * 🛣️ Approach 
    * ❌ from 1 to n tried to do modulo and the number with zero reminder will be added to result array
    * ❌ optimization1 => For sure number will not be divided by number greater than half of itself => reduced iteration to n/2
    * ✅ optimization2 => Another pattern we can see in numbers is : Partion the  number's divisors into [[1,sqrt(n)],[sqrt(n)+1,n/2]],  If we have divisors of range [1,sqrt(n)],then numbers 
       in [sqrt(n)+1,n/2] will be double of each number in [1,sqrt(n)] expect its square root.
* 📆 Day4 - Count pair which give sum K in a sorted array
* 📆 Day5 - Count the unique pair form difference K
     * 🛣️ Approach
         * ❌ o(n^2) brute force with hashset to keep the uniquepair
         * ✅ optimization 1 - HashMap
         * ✅ optimization 2 - TWO pointer with hashset
* 📆 Day6 - Find the first subarray whose sum equals K
     * 🛣️ Approach
         * ❌ o(n^2) form n subarray for each element and return the result when sum is found.
         * ✅ o(n) find prefixSum , then use two pointer => adjust the pointers to form the sum and return once found.
* 📆 Day7 - Generate all the possible valid combinations of paranthesis of given length.
     * 🛣️ Approach
         * ✅ we can use stack , push the brackts and pop them by validating the open and closing brackets length.
         * ✅ Back tracking.
* 📆 Day8 - Find middle element of a linked list.
     * 🛣️ Approach
         * ❌ Brute force - traverse through the linked list and find the length and find mid from it , again traverse until the mid and return the element.
         * ✅ Slow and fast pointer approach - take two pointer , move slow pointer one step at a time and fast pointer two steps at a time , when fast pointer reaches the end of the list then
              slow pointer will be at mid.
* 📆 Day9 - Check the given Linked list is palindrome or not
     * 🛣️ Approach
        * ✅ With slow and fast pointer technique got to the mid of linked list , reverse the first part of the linked list, and then check the second part of the linked list with second part                 whether the values are equal.
        * ✅ Using stack push the first part of the linked list with the midelement found using above approach , and then traverse the second part of the linked list along with poping the stack.
* 📆 Day10 - Learned heap insertion and deletion with min heap - insertion should be done at leaf and deletion should should done at root (A complete binary tree)
* 📆 Day11 -  Array will be given which contain the length of sticks , our job is to connect all the sticks and form them into single one. Restriction : All sticks should be connected with minimum cost. The cost for connecting two sticks will be sum of the length of the sticks.
     * 🛣️ Approach
        * ✅ since we need to connect the sticks with minimum cost , we need to make sure we are connecting minimum elements each time.
        * ✅ Sort the array first
        * ✅ combine two small size sticks at a time and you will get another stick
        * ✅ Now we need to insert the new formed stick to right place , so that again list will be sorted
        * ❌ Using other algorith may result in o(n) time complexity for insertion
        * ✅ with heapify algorithm we can find the position with logn time in the existing heap.
* 📆 Day12 - Ath greatest element in a subarray , subarray will formed with first element. Input : Array , A
     * 🛣️ Approach
        * ✅ Maintain a min heap of size A
        * ✅ whenever an element comes from array which has to inserted into heap , if the element is greater than current min then insert that into heap or else add the current min to the 
          result
* 📆 Day13 - Running Median - find median element whenever a new element comes in to the list
     * 🛣️ Approach
        * ❌ Maintain a new array , do insert element one by one sorted and find median
        * ✅ Build two heaps heap 1 - max heap => contains 1st part of the sorted array min heap => last part of the sorted array find median from it, so this for array whenever element is inserted
* 📆 Day14 - Vertical Order traversal of Binary Tree.
* 📆 Day15 - Heap Sort - heapify top down approach.
* 📆 Day16 - Top View Of a Binary Tree - i.e all the outer nodes in the tree 
    * 🛣️ Approach
       * ✅ start from root go through the left -> left ->left and add all the values in result , then start with right node and move to that node's right right -> right -> right
* 📅 Day17 - Level Order Traversal of binary tree.
    * 🛣️ Approach
       * ✅ do pre order traversal of tree , maintain the row in each recursion call, row is the index of result array, check there is an array inside the result of index row , of not create one , if the element with index value 'row' present then get that array and push the current value.
* 📆 Day18 - Sum of all the subarray
    * 🛣️ Approach
       * ✅ We need the overall sum , so we need to find the number of times   each element contribute to the overall sum, So I wrote down and derived a formula

               1             
               1 2
               1 2 3
               1 2 3 4
               1 2 3 4 5    - contribution of 1 - N (i=0)

               2
               2 3
               2 3 4
               2 3 4 5      - contribution of 2 - (N-1) + (N-1)    2N- 2   (i=1)

               3
               3 4
               3 4 5       -  contribution of 3 - (N-2)+(N-2)+(N-2) 3N-6    (i=3)

         so like wise considering all the ones , I was able to derive the formula - (i+1)*N - (i*(i+1))
* 📆 Day19 - Rotate the given matrix by 90 degree
    * 🛣️ Approach 
        * ✅ Transpose of the matrix and have two pointers swap all the rows of first and last colum , increment the first column and decrement the last column pointer , repeat the step until both meet 
* 📆 Day20 -  Distribute Candy
N children are standing in a line. Each child is assigned a rating value.
You are giving candies to these children subjected to the following requirements:
Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.

What is the minimum number of candies you must give?
* 📆 Day21 - Merge Two sorted Linked Lists
   * 🛣️ Just traversed the two linked list and corrected the connections 😅


    
    




<!---LeetCode Topics Start-->
# LeetCode Topics
## Math
|  |
| ------- |
| [0007-reverse-integer](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0007-reverse-integer) |
| [0009-palindrome-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0009-palindrome-number) |
| [0062-unique-paths](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0062-unique-paths) |
| [0066-plus-one](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0066-plus-one) |
| [0069-sqrtx](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0069-sqrtx) |
| [0070-climbing-stairs](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0070-climbing-stairs) |
| [0189-rotate-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0189-rotate-array) |
| [1013-fibonacci-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1013-fibonacci-number) |
| [1925-count-square-sum-triples](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1925-count-square-sum-triples) |
## Dynamic Programming
|  |
| ------- |
| [0022-generate-parentheses](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0022-generate-parentheses) |
| [0045-jump-game-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0045-jump-game-ii) |
| [0062-unique-paths](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0062-unique-paths) |
| [0064-minimum-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0064-minimum-path-sum) |
| [0070-climbing-stairs](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0070-climbing-stairs) |
| [0118-pascals-triangle](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0118-pascals-triangle) |
| [0119-pascals-triangle-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0119-pascals-triangle-ii) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0198-house-robber](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0198-house-robber) |
| [0300-longest-increasing-subsequence](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0300-longest-increasing-subsequence) |
| [0338-counting-bits](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0338-counting-bits) |
| [0747-min-cost-climbing-stairs](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0747-min-cost-climbing-stairs) |
| [1013-fibonacci-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1013-fibonacci-number) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0070-climbing-stairs) |
| [1013-fibonacci-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1013-fibonacci-number) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0001-two-sum) |
| [0003-longest-substring-without-repeating-characters](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0003-longest-substring-without-repeating-characters) |
| [0076-minimum-window-substring](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0076-minimum-window-substring) |
| [0141-linked-list-cycle](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0141-linked-list-cycle) |
| [0217-contains-duplicate](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0217-contains-duplicate) |
| [0229-majority-element-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0229-majority-element-ii) |
| [0567-permutation-in-string](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0567-permutation-in-string) |
| [3242-count-elements-with-maximum-frequency](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/3242-count-elements-with-maximum-frequency) |
## Linked List
|  |
| ------- |
| [0141-linked-list-cycle](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0141-linked-list-cycle) |
| [0206-reverse-linked-list](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0206-reverse-linked-list) |
## Two Pointers
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0015-3sum) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0088-merge-sorted-array) |
| [0141-linked-list-cycle](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0141-linked-list-cycle) |
| [0189-rotate-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0189-rotate-array) |
| [0567-permutation-in-string](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0567-permutation-in-string) |
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0001-two-sum) |
| [0011-container-with-most-water](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0015-3sum) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0035-search-insert-position) |
| [0045-jump-game-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0045-jump-game-ii) |
| [0064-minimum-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0064-minimum-path-sum) |
| [0066-plus-one](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0066-plus-one) |
| [0078-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0078-subsets) |
| [0080-remove-duplicates-from-sorted-array-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0080-remove-duplicates-from-sorted-array-ii) |
| [0088-merge-sorted-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0088-merge-sorted-array) |
| [0118-pascals-triangle](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0118-pascals-triangle) |
| [0119-pascals-triangle-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0119-pascals-triangle-ii) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0136-single-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0136-single-number) |
| [0189-rotate-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0189-rotate-array) |
| [0198-house-robber](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0198-house-robber) |
| [0217-contains-duplicate](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0217-contains-duplicate) |
| [0229-majority-element-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0229-majority-element-ii) |
| [0300-longest-increasing-subsequence](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0300-longest-increasing-subsequence) |
| [0747-min-cost-climbing-stairs](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0747-min-cost-climbing-stairs) |
| [1046-max-consecutive-ones-iii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1046-max-consecutive-ones-iii) |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
| [2170-count-number-of-maximum-bitwise-or-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2170-count-number-of-maximum-bitwise-or-subsets) |
| [2394-count-subarrays-with-score-less-than-k](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2394-count-subarrays-with-score-less-than-k) |
| [3242-count-elements-with-maximum-frequency](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/3242-count-elements-with-maximum-frequency) |
## Backtracking
|  |
| ------- |
| [0022-generate-parentheses](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0022-generate-parentheses) |
| [0078-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0078-subsets) |
| [2170-count-number-of-maximum-bitwise-or-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2170-count-number-of-maximum-bitwise-or-subsets) |
## Bit Manipulation
|  |
| ------- |
| [0078-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0078-subsets) |
| [0136-single-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0136-single-number) |
| [0191-number-of-1-bits](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0191-number-of-1-bits) |
| [0338-counting-bits](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0338-counting-bits) |
| [2170-count-number-of-maximum-bitwise-or-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2170-count-number-of-maximum-bitwise-or-subsets) |
## Enumeration
|  |
| ------- |
| [1925-count-square-sum-triples](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1925-count-square-sum-triples) |
| [2170-count-number-of-maximum-bitwise-or-subsets](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2170-count-number-of-maximum-bitwise-or-subsets) |
## String
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0003-longest-substring-without-repeating-characters) |
| [0022-generate-parentheses](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0022-generate-parentheses) |
| [0058-length-of-last-word](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0058-length-of-last-word) |
| [0076-minimum-window-substring](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0076-minimum-window-substring) |
| [0567-permutation-in-string](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0567-permutation-in-string) |
## Sliding Window
|  |
| ------- |
| [0003-longest-substring-without-repeating-characters](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0003-longest-substring-without-repeating-characters) |
| [0076-minimum-window-substring](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0076-minimum-window-substring) |
| [0567-permutation-in-string](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0567-permutation-in-string) |
| [1046-max-consecutive-ones-iii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1046-max-consecutive-ones-iii) |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
| [2394-count-subarrays-with-score-less-than-k](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2394-count-subarrays-with-score-less-than-k) |
## Binary Search
|  |
| ------- |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0069-sqrtx) |
| [0300-longest-increasing-subsequence](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0300-longest-increasing-subsequence) |
| [1046-max-consecutive-ones-iii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1046-max-consecutive-ones-iii) |
| [2394-count-subarrays-with-score-less-than-k](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2394-count-subarrays-with-score-less-than-k) |
## Prefix Sum
|  |
| ------- |
| [1046-max-consecutive-ones-iii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1046-max-consecutive-ones-iii) |
| [2394-count-subarrays-with-score-less-than-k](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/2394-count-subarrays-with-score-less-than-k) |
## Counting
|  |
| ------- |
| [0229-majority-element-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0229-majority-element-ii) |
| [3242-count-elements-with-maximum-frequency](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/3242-count-elements-with-maximum-frequency) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0015-3sum) |
| [0088-merge-sorted-array](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0088-merge-sorted-array) |
| [0217-contains-duplicate](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0217-contains-duplicate) |
| [0229-majority-element-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0229-majority-element-ii) |
## Queue
|  |
| ------- |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
## Heap (Priority Queue)
|  |
| ------- |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
## Ordered Set
|  |
| ------- |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
## Monotonic Queue
|  |
| ------- |
| [1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1549-longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0011-container-with-most-water) |
| [0045-jump-game-ii](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0045-jump-game-ii) |
## Database
|  |
| ------- |
| [0175-combine-two-tables](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0175-combine-two-tables) |
| [0176-second-highest-salary](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0176-second-highest-salary) |
| [0177-nth-highest-salary](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0177-nth-highest-salary) |
| [0181-employees-earning-more-than-their-managers](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0181-employees-earning-more-than-their-managers) |
| [0183-customers-who-never-order](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0183-customers-who-never-order) |
| [0196-delete-duplicate-emails](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0196-delete-duplicate-emails) |
| [0197-rising-temperature](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0197-rising-temperature) |
| [0577-employee-bonus](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0577-employee-bonus) |
| [0584-find-customer-referee](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0584-find-customer-referee) |
| [0586-customer-placing-the-largest-number-of-orders](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0586-customer-placing-the-largest-number-of-orders) |
| [1179-game-play-analysis-i](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1179-game-play-analysis-i) |
## Stack
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0094-binary-tree-inorder-traversal) |
## Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0094-binary-tree-inorder-traversal) |
| [0112-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0112-path-sum) |
## Depth-First Search
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0094-binary-tree-inorder-traversal) |
| [0112-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0112-path-sum) |
## Binary Tree
|  |
| ------- |
| [0094-binary-tree-inorder-traversal](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0094-binary-tree-inorder-traversal) |
| [0112-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0112-path-sum) |
## Divide and Conquer
|  |
| ------- |
| [0191-number-of-1-bits](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0191-number-of-1-bits) |
## Recursion
|  |
| ------- |
| [0206-reverse-linked-list](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0206-reverse-linked-list) |
| [1013-fibonacci-number](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/1013-fibonacci-number) |
## Breadth-First Search
|  |
| ------- |
| [0112-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0112-path-sum) |
## Combinatorics
|  |
| ------- |
| [0062-unique-paths](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0062-unique-paths) |
## Matrix
|  |
| ------- |
| [0064-minimum-path-sum](https://github.com/selvadharani192/Daily_Problem_Solving/tree/master/0064-minimum-path-sum) |
<!---LeetCode Topics End-->