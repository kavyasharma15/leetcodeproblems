class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int maxleft[]= new int[n];
        maxleft[0]=height[0];
        for(int i = 1;i<n;i++){
            maxleft[i] = Math.max(height[i],maxleft[i-1]);
        }

        int maxright[]= new int[n];
        maxright [n-1] = height[n-1];
        for(int i = n-2;i>=0;i--){
            maxright[i] = Math.max(height[i],maxright[i+1]);
        }
        int trappedwater= 0;

        for(int i = 0;i<n;i++){
            int waterlevel=Math.min(maxleft[i], maxright[i]);

            trappedwater += waterlevel-height[i];
        }
         return trappedwater;



    }
}