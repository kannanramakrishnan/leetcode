class Dota2Senate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rq = new LinkedList<Integer>();
        Queue<Integer> rd = new LinkedList<Integer>();
        int n = senate.length();
        for(int i=0; i<n;i++) {
            if(senate.charAt(i)=='R') rq.add(i);
            else rd.add(i);
        }

        for(;!rq.isEmpty() && !rd.isEmpty();) {
            int r = rq.poll();
            int d = rd.poll();
            if(r<d) rq.add(r+n);
            else rd.add(d+n);
        }
        return rq.size() > rd.size()?"Radiant" : "Dire";
    }
}
