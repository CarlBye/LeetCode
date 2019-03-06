class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int size = nums.size();
        vector<int> s(2,0);
        for(int i = 0;i < size;i++) {
            for(int j = i+1;j < size;j++) {
                if(nums[i] + nums[j] == target){
                    s[0] = i;
                    s[1] = j;                    
                }
            }
        }
        return s;
    }
};