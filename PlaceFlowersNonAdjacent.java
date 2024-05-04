class PlaceFlowersNonAdjacent {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i=0; i<flowerbed.length; i++) {
            if(flowerbed[i]==0) {
              boolean  empltyLeftPlot =  (i == 0) || flowerbed[i-1] == 0;
              boolean emptyRightPlot =  (i == flowerbed.length-1) || flowerbed[i+1] == 0;

              if(empltyLeftPlot && emptyRightPlot) {
                flowerbed[i] = 1;
                count++;

                if(count>=n) {
                    return true;
                }
              }
            }
        }
        return count>=n;
    }
}
