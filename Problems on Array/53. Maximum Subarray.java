https://leetcode.com/problems/maximum-subarray/submissions/1702738763/


class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        int maxx = Integer.MIN_VALUE;

        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                 sum = sum + a[j];
                 maxx = Math.max(sum,maxx);
            }
        }
        return maxx;
    }
}
