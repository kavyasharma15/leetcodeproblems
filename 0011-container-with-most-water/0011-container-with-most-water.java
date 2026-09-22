class Solution {
    public int maxArea(int[] height) {
        //bruteforce Approach
        // int max = 0;
        // for(int i = 0;i<height.length;i++){
        //     for(int j = 0;j<height.length;j++){
        //         int w= j-i;
        //         int h= Math.min(height[i],height[j]);
        //         int area= w * h;
                
        //         max= Math.max(area,max);
        //     }
        // }
        // return max;

        //this is two pointer approach  t.c=o(n)
        int n = height.length;
        int lp= 0 ; int rp = n-1;
        int max=0;
        while(lp<rp){
            int w = rp-lp;
            int h = Math.min(height[lp],height[rp]);
            int area= w*h;
            max = Math.max(area,max);

            if(height[lp]<height[rp]){
                lp++;
            }
            else{
                rp--;
            }

        }
        return max;

    
    
    }
}