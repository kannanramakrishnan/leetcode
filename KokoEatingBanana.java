class KokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles, h, mid)) {
                high = mid; // Lower the maximum boundary if we can finish with mid speed
            } else {
                low = mid + 1; // Increase the minimum speed if mid is not sufficient
            }
        }

        return low; // The first speed at which Koko can finish all bananas
    }

    private boolean canFinish(int[] piles, int h, int k) {
        long hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k; // Calculate required hours for each pile
            if (hoursNeeded > h) {
                return false; // Early exit if we already exceed the allowed hours
            }
        }
        return true;
    }
}
