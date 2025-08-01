class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         // Step 1: Count frequency using a HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            // If num is already in the map, it gives its current value (frequency)
        }

        // Step 2: Use a max-heap (priority queue) to sort elements by frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> freqMap.get(b) - freqMap.get(a)
        );

        maxHeap.addAll(freqMap.keySet());

        // Step 3: Get top K frequent elements from the heap
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
    
}