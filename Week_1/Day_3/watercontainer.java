package Week_1.Day_3;

public class watercontainer {
 public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int maxsum=0;
        while(l<r){ 
            maxsum=maxsum>(r-l)*Math.min(height[l],height[r])?maxsum:(r-l)*Math.min(height[l],height[r]);
            if(height[l]<height[r]){l++;} 
            else{r--;}
        }
        return maxsum;
    }
}
