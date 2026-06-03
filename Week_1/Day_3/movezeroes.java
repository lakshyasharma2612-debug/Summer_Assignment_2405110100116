package Week_1.Day_3;

public class movezeroes {
 public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        int temp;
        int j=1;
        for (int i=0;i<nums.length;i++)
        {   j=j<=i?i:j;
            if(nums[i]==0)
            {
                while(nums[j]==0&&j<nums.length-1){
                    j++;
                }
                if(nums[j]!=0)
                {
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                }
            }
            
        }

    }
}