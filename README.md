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


    
    



