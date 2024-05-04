class GreatestCandiesNumber {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = 0;
        for(int candy: candies)
        {
            maxCandies = Math.max(maxCandies, candy);
        }
        List<Boolean> result = new ArrayList<Boolean>();

        for(int candy: candies)
        {
            result.add(candy+extraCandies>=maxCandies);
        }

        return result;
    }
}
