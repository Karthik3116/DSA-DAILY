class Solution {
    public int minimumOperations(int[] nums) {

        List<Integer> num = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            num.add(nums[i]);
        }
        int operations = 0, idx = 0;
        while(idx < num.size() ){
            if(Collections.frequency(num,num.get(idx)) > 1){
                if(num.size() >= 3){
                    for(int i = 0 ; i < 3 ; i++){
                        num.remove(0);
                    }
                    operations++;
                    idx = 0;
                    
                }else{
                    operations++;
                    
                    break;
                }
                
            }else{
                idx = idx +1;
            }
        }
        
        System.out.println(operations);

        return operations;
    }
}