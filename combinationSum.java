class Solution {
    List<List<Integer>> lst;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        lst = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        backtracking(candidates,target,0,new ArrayList<Integer>());
        return lst;
    }
    public void backtracking(int[] candidates, int target, int start, ArrayList<Integer> arr) {
        if (target==0) {
            lst.add(new ArrayList<Integer>(arr));
            return;
        }
        for (int i=start;i<candidates.length && candidates[i]<=target;i++) {
            arr.add(candidates[i]);
            backtracking(candidates,target-candidates[i],i,arr);
            arr.remove(arr.size()-1);
        }
    }
}
