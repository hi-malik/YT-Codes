class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> (map.get(b) - map.get(a)));
	maxHeap.addAll(map.keySet());

	// Build string
	StringBuilder sb = new StringBuilder();
	while (!maxHeap.isEmpty()) {
		char c = maxHeap.poll();
		for (int i = 0; i < map.get(c); i++) {
			sb.append(c);
		}
	}
	return sb.toString();
    }
}

// Time Complexity: O(nlogk)
// Space Complexity: O(n)

// Date :- 03/12/2022