class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
       Deque<Integer> stack = new LinkedList<Integer>();

        for(int i = 0 ; i < temperatures.length; i++) {

            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i-idx;
            }

            stack.push(i);
        }
        return result;
    }
}
