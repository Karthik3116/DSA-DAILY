class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s);

        int count = 0;
        for(int space : spaces){
            sb.insert(space + count++, " ");
        }


        return sb.toString();
    }
}