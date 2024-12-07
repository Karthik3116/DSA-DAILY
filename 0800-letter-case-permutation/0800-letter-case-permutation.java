import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<String> solve(String input, String output, List<String> ans, int index) {
        if (index == input.length()) {
            ans.add(output);
            return ans;
        }

        char currentChar = input.charAt(index);

        if (!Character.isLetter(currentChar)) {
            return solve(input, output + currentChar, ans, index + 1);
        }

        solve(input, output + currentChar, ans, index + 1);

        if (Character.isUpperCase(currentChar)) {
            solve(input, output + Character.toLowerCase(currentChar), ans, index + 1);
        } else {
            solve(input, output + Character.toUpperCase(currentChar), ans, index + 1);
        }

        return ans;
    }

    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        return solve(s, "", ans, 0);
    }
}
