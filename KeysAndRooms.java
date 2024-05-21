class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        while(!stack.isEmpty()) {
           int key = stack.pop();

            for(int i:rooms.get(key)) {
                if(!seen[i]) {
                    seen[i] = true;
                    stack.push(i);
                }
            }
        }

        for(boolean v: seen){
            if(!v) return false;
        }
        return true;
    }
}
