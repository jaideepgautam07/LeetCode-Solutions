class Solution {
    protected void backtrack(int remain, int k, LinkedList<Integer> comb, int next_start, List<List<Integer>> result){
        if(remain == 0 && comb.size() == k){
            result.add(new ArrayList<Integer>(comb));
            return;
        }
        else if(remain < 0 || comb.size() == k){
            return;
        }
        for(int i = next_start; i<9; ++i){
            comb.add(i+1);
            this.backtrack(remain-i-1, k, comb, i+1, result);
            comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        this.backtrack(n, k, comb, 0, result);    
        return result;    
    }
}