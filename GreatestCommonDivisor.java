class GreatestCommonDivisor {

    public boolean valid(String w1, String w2, int k)
    {
        int len1 = w1.length(); int len2 = w2.length();
        if(len1%k>0 || len2%k>0)
            return false;
        else
        {
            String base = w1.substring(0,k);
            return w1.replace(base,"").isEmpty() && w2.replace(base, "").isEmpty();
        }
        

    }

    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        for(int i = Math.min(m,n);i>=1;i--)
        {
            if(valid(str1, str2, i))
            {
                return str1.substring(0,i);
            }
        }
        return "";
    }
}
