class Solution {
    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int vol = 0;
        while(lp<rp){
            
            int ht = height[lp] < height[rp] ? height[lp] : height[rp];
            int w = rp-lp;

            if(vol<ht*w){
                vol = ht*w;
            }

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return vol;

        // while(lp<rp){
        //     int ht = Math.min(height[rp], height[lp]);
        //     int w = rp-lp;
        //     vol = Math.max(vol, ht*w);

        //     if(height[lp]<height[rp]){
        //         lp++;
        //     }else{
        //         rp--;
        //     }
        // }
        // return vol;
    }
}