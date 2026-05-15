package LeeCode_java;
//盛水最多的容器
public class maxArea_11{
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length-1;
        while(left != right){
            int temp = 0;
            if(height[left] <= height[right]){
                temp = height[left]*(right-left);
                left++;
            }
            else{
                temp = height[right]*(right-left);
                right--;
            }
            if(temp > ans){
                ans = temp;
            }
        }
        return ans;
    }
}