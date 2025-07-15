https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description/

class Solution {
    public boolean check(int[] a) {
        int n = a.length;
        int count=0;

        for(int i=1; i<n; i++)
        {
            if(a[i] < a[i-1])
            {
                count++;
            }
        }
        if(a[n-1] > a[0])
        {
            count++;
        }

        return count <= 1;
    }
}
