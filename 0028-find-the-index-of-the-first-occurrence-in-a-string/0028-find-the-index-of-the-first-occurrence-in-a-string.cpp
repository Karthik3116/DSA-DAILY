class Solution {
public:
    int strStr(string haystack, string needle) {
        
        
        int hsize = haystack.size();
        int nsize = needle.size();

        if(nsize == 0){
            return 0;
        }

        for(int i = 0 ; i < hsize; i++){
            if(haystack.substr(i,nsize) == needle){
                return i;
            }
        }

        return -1;
    
    }
};