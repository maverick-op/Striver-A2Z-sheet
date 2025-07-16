https://leetcode.com/problems/move-zeroes/



class Solution {
    public void moveZeroes(int[] a) {
        int n = a.length;

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            if(a[i] != 0)
            {
                arr.add(a[i]);
            }
        }
        for(int i=0; i<n; i++)
        {
            if(a[i] == 0)
            {
                arr.add(a[i]);
            }
        }

        for(int i=0; i<arr.size(); i++)
        {
            a[i] = arr.get(i);
        }
        
    }
}
