class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min= 1000000;
        int max=-1000000;
        int s=-1,b=-1;
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                s=i;
            }
            if(nums[i]>max){
                max=nums[i];
                b=i;
            }
        }
        if(s>b){
            int temp=b;
            b=s;
            s=temp;
        }
        int opt1= s+1+(n-b);
        int opt2=b+1;
        int opt3=n-s;
        return Math.min(Math.min(opt1,opt2),opt3);
    }
}