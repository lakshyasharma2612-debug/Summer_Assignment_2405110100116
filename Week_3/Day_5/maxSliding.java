package Week_3.Day_5;

import java.util.ArrayDeque;
import java.util.Deque;

public class maxSliding {
    
public int[] maxSlidingWindow(int[] nums, int k) {

  int n = nums.length;
  if (n == 0 || k == 0) {
    return new int[0];
  }
  int res[] = new int[n - k + 1]; 

  Deque<Integer> que = new ArrayDeque<>();
  
  for(int i=0;i<n;i++){
    
    while (que.size()> 0 && que.peekFirst()<= i-k) {
      que.pollFirst();
    }
    
    while (que.size() > 0 && nums[que.peekLast()] < nums[i]) {
      que.pollLast();
    }
    
    que.offerLast(i);
    
    if (i >= k - 1) {
      res[i - k + 1] = nums[que.peekFirst()];
    }
    
    }
 return res;
    }
}
