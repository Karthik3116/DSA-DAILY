// ans :- 1

//  StringBuilder sb = new StringBuilder(s);

//         int count = 0;
//         for(int space : spaces){
//             sb.insert(space + count++, " ");
//         }


//         return sb.toString();


// ans-2 beats 40%
// StringBuilder sb = new StringBuilder();
//        int count = 0;

//        for(int i = 0 ; i < s.length() ; i++){
//         if(count < spaces.length && spaces[count] == i){
//             sb.append(" ");
//             count++;
//         }
//         sb.append(s.charAt(i));
//        }
//        return sb.toString();





class Solution {
    public String addSpaces(String s, int[] spaces) {
       
       int m = s.length();
       int n = spaces.length;

       char[]chararr = new char[m+n];
       int i = 0 , j = 0;
       for(char c : s.toCharArray()){
        if(j < n && spaces[j] == i){
            chararr[j+i] = ' ';
            j++;
        }
        chararr[j+i] = c;
        i++;
       }

       return new String(chararr);
    }
}