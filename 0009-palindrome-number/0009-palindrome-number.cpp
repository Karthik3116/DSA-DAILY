class Solution {
public:
    bool isPalindrome(int x) {
        string num = to_string(x);

        string num2 ;

        for(int i = num.length()-1 ; i >=0 ; i--){
            num2 += num[i];
        }

        bool res = true;
        for(int i = 0; i < num.length(); i++){
            if(num2[i] != num[i]){
                return false;
            }
        }

        return res;

    }
};