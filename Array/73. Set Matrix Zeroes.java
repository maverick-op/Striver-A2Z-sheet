https://leetcode.com/problems/set-matrix-zeroes/description/
class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[] temp = new int[n];
        for(int i=0; i<n; i++)
        {
            temp[i] = -1;
        }
        int[] temp1 = new int[m];
        for(int i=0; i<m; i++)
        {
            temp1[i] = -1;
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(a[i][j] == 0)
                {
                    temp[i] = 0;
                    temp1[j] = 0;
                }
            }
        }

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(temp[i]==0 || temp1[j]==0)
                {
                    a[i][j] = 0;
                }
            }
        }
    }
}
