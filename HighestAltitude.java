class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int alt = 0, max = 0;
        for(int g: gain) {
            alt += g;
            max = Math.max(max, alt);
        }
        return max;
    }
}
