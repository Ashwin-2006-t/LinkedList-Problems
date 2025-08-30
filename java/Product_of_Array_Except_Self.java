class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prod=1;int zeroCount=0;

        for(int num : nums){
            if(num!=0){
                prod*=num;
            }
            else{
                zeroCount++;
            }
        }
        if(zeroCount>1) return new int [nums.length];

        int res [] = new int[nums.length]; 
        for(int i=0; i<nums.length;i++){
            if(zeroCount>0){
                res[i]= (nums[i]==0)? prod : 0;
            }
            else{
                res[i]=prod/nums[i];
            }
        }
        
        
        return res;
        
    }
}



class Solution {
    public int[] productExceptSelf(int[] nums) {
            
            int [] res = new int[nums.length];
            int [] prefix = new int[nums.length];
            int [] sufix = new int [nums.length];

            prefix[0]=1;
            sufix[nums.length -1]=1;

            for(int i=1;i<nums.length;i++){
                prefix[i]=nums[i-1]*prefix[i-1];
            }

            for(int i=nums.length-2;i>=0;i--){
                sufix[i]=nums[i+1]*sufix[i+1];
            }

            for(int i=0;i<nums.length;i++){
                res[i]=prefix[i]*sufix[i];
            }

            return res;
    }
}





class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] res = new int[n];

        for(int i=0;i<n;i++){
            int prod =1;
            for(int j=0;j<n;j++){
                if(j!=i){
                    prod*=nums[j];
                }
                
            }
            res[i]=prod;
        }
        return res;


        
    }
}