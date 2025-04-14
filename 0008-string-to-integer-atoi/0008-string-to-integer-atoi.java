class Solution {
    public int myAtoi(String s) {
        boolean started = false;
        int sign = 1;     
        long ans = 0;
        
        for (char c : s.toCharArray()) {
            if (!started) {
                
                if (c == ' ') {
                    continue;
                }
                
                if (c == '+' || c == '-') {
                    sign = (c == '-') ? -1 : 1;
                    started = true;
                    continue;
                }
                
                if (Character.isDigit(c)) {
                    ans = ans * 10 + (c - '0');
                    started = true;
                    continue;
                }
                
                break;
            } else {
                
                if (Character.isDigit(c)) {
                    ans = ans * 10 + (c - '0');
                    
                    
                    if (sign == 1 && ans > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                    if (sign == -1 && -ans < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                } else {
                    break;
                }
            }
        }
        
        return (int)(sign * ans);
    }
}
