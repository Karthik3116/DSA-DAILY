// class Solution {
//     public int[] plusOne(int[] digits) {
//         StringBuilder numstr = new StringBuilder();

//         for(int one : digits){
//             numstr.append(one);
//         }

//         int nums = Integer.parseInt(numstr.toString()) + 1;
//         int len = String.valueOf(nums).length();
//         String newstr = Integer.toString(nums);

//         int []ans = new int[len];

//         for(int i = 0 ; i < len ; i++){
//             ans[i] = Character.getNumericValue(newstr.charAt(i));

//         }

//         return ans;


//     }
// }



class Solution {
    public int[] plusOne(int[] digits) {
        // Start from the end of the array (least significant digit)
        for (int i = digits.length - 1; i >= 0; i--) {
            // If the current digit is less than 9, just increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, set it to 0 and move to the next digit
            digits[i] = 0;
        }

        // If all digits were 9, we need an array with an extra digit, all set to 0 except the first one
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1; // The first digit will be 1, and the rest are 0 by default
        return newDigits;
    }
}
