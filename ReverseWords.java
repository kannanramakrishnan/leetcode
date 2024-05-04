class ReverseWords {
    public String reverseWords(String s) {
     String[] ws = s.trim().split("\\s+");
     StringBuilder st = new StringBuilder();
     for(int i= ws.length -1; i>=0;i--){
        st.append(ws[i]).append(" ");
     }
     return st.toString().trim();
    }
}
