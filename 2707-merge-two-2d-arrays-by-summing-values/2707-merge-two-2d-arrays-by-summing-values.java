// using hashmap
// class Solution {
//     public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        
//         HashMap<Integer,Integer> map = new LinkedHashMap<>();

//         int l1 = nums1.length , l2 = nums2.length , i = 0 , j = 0 ;
//         while(i < l1 && j < l2 ){
            
//             if(nums1[i][0] < nums2[j][0]){
//                 map.put(nums1[i][0] , map.getOrDefault(nums1[i][0] , 0 ) + nums1[i][1] );
                
//                 i++;
//             }else{
//                 map.put(nums2[j][0] , map.getOrDefault(nums2[j][0] , 0 ) + nums2[j][1] );
                
//                 j++;
                
//             }
            
            
//         }

//         if(i < l1){
//             while(i < l1){
//                 map.put(nums1[i][0] , map.getOrDefault(nums1[i][0] , 0 ) + nums1[i][1] );
//                 i++;
//             }
//         }else{
//             while(j < l2){
//                 map.put(nums2[j][0] , map.getOrDefault(nums2[j][0] , 0 ) + nums2[j][1] );
//                 j++;
//             }
//         }


//         i = 0;
//         int[][]ans = new int[map.size()][2];
//         for(int key : map.keySet()){
//             ans[i][0] = key;
//             ans[i][1] = map.get(key);
//             i++;
            
//         }



//         return ans;
//     }
// }

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int l1 = nums1.length, l2 = nums2.length, i = 0, j = 0, k = 0;
        int[][] ans = new int[l1 + l2][2]; 
        
        while (i < l1 && j < l2) {
            if (nums1[i][0] < nums2[j][0]) {
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1];
                i++;
            } else if (nums1[i][0] > nums2[j][0]) {
                ans[k][0] = nums2[j][0];
                ans[k][1] = nums2[j][1];
                j++;
            } else { 
                ans[k][0] = nums1[i][0];
                ans[k][1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            }
            k++;
        }


        while (i < l1) {
            ans[k][0] = nums1[i][0];
            ans[k][1] = nums1[i][1];
            i++;
            k++;
        }


        while (j < l2) {
            ans[k][0] = nums2[j][0];
            ans[k][1] = nums2[j][1];
            j++;
            k++;
        }


        int[][] result = new int[k][2];
        for (int x = 0; x < k; x++) {
            result[x] = ans[x];
        }

        return result;
    }
}
