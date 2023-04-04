class Solution {
    static void swap(int[]nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void solve(int[] nums,int idx,List<List<Integer>> ans){
        if(idx==nums.length-1){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            solve(nums,idx+1,ans);
            swap(nums,idx,i);
        }
        return;

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        solve(nums,0,ans);
        return ans;
    }
}