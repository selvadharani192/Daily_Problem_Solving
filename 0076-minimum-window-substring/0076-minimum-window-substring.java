class Solution {
    public String minWindow(String s, String t) {
        if (t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        // 1. Setup Target Frequency Map (from T)
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char c : t.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int min = Integer.MAX_VALUE;
        int leftIndex = -1; // Stores the start index of the minimum valid window

        // Window tracking map and match counter
        HashMap<Character, Integer> frequencyForWindow = new HashMap<>();
        int windowSize = 0; // Tracks the number of unique characters in T that are satisfied

        // 2. Sliding Window Logic
        for (int right = 0; right < s.length(); right++) {
            char charRight = s.charAt(right);

            if (frequency.containsKey(charRight)) {
                // Expansion: Add character to window
                frequencyForWindow.put(charRight, frequencyForWindow.getOrDefault(charRight, 0) + 1);

                // Check if this addition satisfied a new unique character requirement
                // CRITICAL FIX: Use .intValue() for reliable numerical comparison
                if (frequencyForWindow.get(charRight).intValue() == frequency.get(charRight).intValue()) {
                    windowSize++;
                }
            }

            // Contraction: Shrink the window while it is valid
            // CRITICAL FIX: windowSize should be compared to frequency.size() (unique chars)
            while (windowSize == frequency.size()) {
                
                // a. Update Minimum Result
                int currentLength = right - left + 1;
                if (currentLength < min) {
                    min = currentLength;
                    leftIndex = left; // Store the start index
                }

                // b. Shrink the window from the left
                char charLeft = s.charAt(left);

                if (frequency.containsKey(charLeft)) {
                    // Check if removing this character will break the match
                    // CRITICAL FIX: Use .intValue() for reliable numerical comparison
                    if (frequencyForWindow.get(charLeft).intValue() == frequency.get(charLeft).intValue()) {
                        windowSize--; // Decrement match if the requirement is broken
                    }
                    
                    // Action: Remove the character from the window count
                    frequencyForWindow.put(charLeft, frequencyForWindow.get(charLeft) - 1);
                }

                left++; // Slide the left pointer
            }
        }

        // 3. Robust and Efficient Result Generation
        if (leftIndex == -1) {
            return "";
        }
        // Use String.substring for O(1) extraction (avoids TLE on large strings)
        return s.substring(leftIndex, leftIndex + min);
    }
}