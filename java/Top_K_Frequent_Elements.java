class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        List<int []> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});

        }
        arr.sort((a,b)->b[0]-a[0]);

        int res[]= new int[k];
        for(int i=0;i<k;i++){
            res[i]=arr.get(i)[1];
        }
     return res;   
    }
}




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




class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> count = new HashMap<>();

        for(int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }

        PriorityQueue<int []> heap = new PriorityQueue<>((a,b)-> a[0]-b[0]);
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            heap.offer(new int[]{entry.getValue(),entry.getKey()});
            if(heap.size()>k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i]=heap.poll()[1];
        }

        return res;
    }
}



