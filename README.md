# 50_Days_Daily_Problem_Solving_Challenge

* 📆 Day1 - Implemented a simple LRU CACHE with HASHMAP and doubly linked list
* 📆 Day2 - Subarrays whose sum equlas k in brute force approach
* 📆 Day3 - Count of divisors
  * 🛣️ Approach 
    * ❌ from 1 to n tried to do modulo and the number with zero reminder will be added to result array
    * ❌ optimization1 => For sure number will not be divided by number greater than half of itself => reduced iteration to n/2
    * ✅ optimization2 => Another pattern we can see in numbers is : Partion the  number's divisors into [[1,sqrt(n)],[sqrt(n)+1,n/2]],  If we have divisors of range [1,sqrt(n)],then numbers 
       in [sqrt(n)+1,n/2] will be double of each number in [1,sqrt(n)] expect its square root.


    
    



