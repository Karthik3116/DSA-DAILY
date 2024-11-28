class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I' , 1);
        map.put('V' , 5);
        map.put('X' , 10);
        map.put('L' , 50);
        map.put('C' , 100);
        map.put('D' , 500);
        map.put('M' , 1000);
        
        int ans = 0;

        for(int i = 0 ; i < s.length(); i++){
            
            char symbol = s.charAt(i);
            

            if(i < s.length() - 1 && (((symbol == 'I') && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))||
                                        ((symbol == 'X') && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))||
                                        ((symbol == 'C') && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                                        )){

                ans += map.get(s.charAt(i+1)) - map.get(symbol);
                i++;
            }

            else{
                
                ans += map.get(symbol);
                
            }

            
            
        }

        return ans;
        
    }
}