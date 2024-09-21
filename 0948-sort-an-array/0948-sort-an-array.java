class Solution {

    public int partition(int[] arr, int low, int high) {
        // Use the middle element as the pivot to avoid worst-case performance
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        
        // Move pivot to the end
        swap(arr, mid, high);
        
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, high);
        return i;
    }

    public void quickSort(int[] arr, int low, int high) {
        while (low < high) {
            int pidx = partition(arr, low, high);
            
            // Sort the smaller partition first to optimize recursion depth
            if (pidx - low < high - pidx) {
                quickSort(arr, low, pidx - 1);
                low = pidx + 1;  // Tail recursion for the larger partition
            } else {
                quickSort(arr, pidx + 1, high);
                high = pidx - 1;  // Tail recursion for the smaller partition
            }
        }
    }

    // Helper function to swap elements
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}





// class Solution {

//     public int partition(int []arr ,int low , int high ){
//         int pivot = arr[high];
//         int i = low - 1;

//         for(int j = low ; j < high ; j++){
//             if(arr[j] < pivot){
//                 i++;
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//             }
//         }
//         i++;
//         int temp = arr[i];
//         arr[i] = pivot;
//         arr[high] = temp; 
//         return i;
//     }

//     public void Quick_sort(int []arr , int low , int high){

//         if(low < high){
//             int pidx = partition(arr , low , high);
//             Quick_sort(arr, low , pidx - 1);
//             Quick_sort(arr, pidx + 1 , high);
            
//         }
//     }

//     public int[] sortArray(int[] nums) {

//         Quick_sort(nums, 0, nums.length - 1);
//         return nums;

//     }
// }
