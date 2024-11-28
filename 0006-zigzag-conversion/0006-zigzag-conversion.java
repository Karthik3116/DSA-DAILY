class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows == 1){return s;};

        StringBuilder sb = new StringBuilder();

        for(int r = 0 ; r < numRows ; r++){
            int inc = 2 * (numRows - 1);

            for(int i = r ; i < s.length() ; i+=inc){

                sb.append(s.charAt(i));

                if(r > 0 && r < numRows-1 && i + inc -  2*r < s.length()){
                    sb.append(s.charAt(i + inc - 2*r));
                }
            }
        }

        return sb.toString();
    }
}