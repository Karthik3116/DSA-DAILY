
class Solution {
    public String countAndSay(int n) {
        
        StringBuilder sb = new StringBuilder("1");

        for(int i = 1 ; i < n ; i++){
            StringBuilder temp = new StringBuilder();
            char prev = sb.charAt(0);
            int count = 1;
            
            for(int j = 1 ; j < sb.length() ; j++){

                if(sb.charAt(j) == prev){
                    count += 1;
                }else{
                    temp.append(count);
                    temp.append(prev);
                    prev = sb.charAt(j);
                    count = 1;
                }
            }
            temp.append(count);
            temp.append(prev);

            sb = temp;
            
        }

        return sb.toString();
    }
}