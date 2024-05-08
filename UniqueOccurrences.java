class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for(int i:arr) {
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        for(int x: freq.values()) {
            if(s.contains(x)) return false;
            s.add(x);
        }

        return s.size() == freq.size();
    }
}
