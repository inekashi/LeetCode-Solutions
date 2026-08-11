class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if (nums.length==0|| nums.length==1){
            return ;
        }
        int m=0,s=0;
        int arr[]= new int [nums.length];
        int rotate=nums.length-k;
        for (int i =rotate;i<nums.length;i++){
            arr[m]=nums[i];
            m++;
        }
        for (int j =0;j<rotate;j++){
            arr[m]=nums[j];
            m++;
        }
        for (int p:arr){
            nums[s]=p;
            s++;
        }
    }
}