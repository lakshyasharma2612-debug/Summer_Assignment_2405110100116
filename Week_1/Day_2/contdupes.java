package Week_1.Day_2;

import java.util.HashSet;
import java.util.Set;

public class contdupes {
public boolean containsDuplicate(int[] nums) {
        Set <Integer> s = new HashSet<>();
        for (int i=0;i<nums.length;i++)
        {
            s.add(nums[i]);
        }
        return s.size()!=nums.length;
    }
}
