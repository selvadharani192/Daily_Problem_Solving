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
  


    
    



