// ans :- 1

//  StringBuilder sb = new StringBuilder(s);

//         int count = 0;
//         for(int space : spaces){
//             sb.insert(space + count++, " ");
//         }


//         return sb.toString();

class Solution {
    public String addSpaces(String s, int[] spaces) {
       StringBuilder sb = new StringBuilder();
       int count = 0;

       for(int i = 0 ; i < s.length() ; i++){
        if(count < spaces.length && spaces[count] == i){
            sb.append(" ");
            count++;
        }
        sb.append(s.charAt(i));


       }

       return sb.toString();
    }
}