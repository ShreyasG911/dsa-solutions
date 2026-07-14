class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
       
        for(int i=0; i<nums.length; i++){
           int num=target-nums[i];

           if(hm.containsKey(num))
           {
            first=hm.get(num);
            last=i;
            arr[0]=first;
            arr[1]=last;
            return arr;
            
           }

           hm.put(nums[i],i);
            
        }
        return arr;

    }
}