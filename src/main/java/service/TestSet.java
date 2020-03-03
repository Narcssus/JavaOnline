package service;

/**
 * @author : Narcssus
 * @date : 2020/3/3 21:36
 */
public class TestSet {
    public String runTest(){
        int[] nums = new int[]{1, 2, 3};
        int target = 3;
        Solution s = new Solution();
        int[] res = s.twoSum(nums,target);
        if(res.length == 2){
            return "yes";
        }
        return "no";
    }
}
