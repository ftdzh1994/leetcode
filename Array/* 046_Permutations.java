import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        boolean[] used = new boolean [n];
        dfs(nums, used, path, res);
        return res;
    }

    public void dfs(int[] nums, boolean[] uesd, List<Integer> path, List<List<Integer>> res){
        if (path.size() == nums.length;) {
            res.add(new List<Integer> (path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            dfs(nums, used, path, res);
            used[i] = false;
            path.remove(path.size() - 1);
        }
    }
}