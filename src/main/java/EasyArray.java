import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EasyArray {
  public static int largestElement(int[] nums) {
    int res = Integer.MIN_VALUE;
    for (int i : nums) {
      if (i > res)
        res = i;
    }
    return res;
  }

  public static int secondLargestElement(int[] nums) {
    int res = -1, temp = -1;
    for (int i : nums) {
      if (i > res) {
        temp = res;
        res = i;
      }
    }
    return temp;
  }

  public static boolean isSorted(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] < nums[i - 1])
        return false;
    }
    return true;
  }

  public static int removeDuplicates(int[] nums) {
    Set<Integer> h = new HashSet<Integer>();
    for (int i : nums)
      h.add(i);
    return h.size();
  }

  public static void rotateArrayByOne(int[] nums) {
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i == 0)
        temp = nums[i];
      if (nums.length - 1 > i)
        nums[i] = nums[i + 1];
      else
        nums[i] = temp;
    }
  }

  public static void rotateArray(int[] nums, int k) {
    k = k % nums.length;
    int[] arr = new int[k];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = nums[i];
    }
    int c = 0;
    for (int i = 0; i < nums.length; i++, k++) {
      if (nums.length > k)
        nums[i] = nums[k];
      else {
        nums[i] = arr[c];
        c++;
      }
    }
  }

  public static void moveZeroes(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 0) {
        nums[i] = nums[i + 1] + nums[i];
        nums[i + 1] = nums[i] - nums[i + 1];
        nums[i] = nums[i] - nums[i + 1];
      }
    }
  }

  public static int linearSearch(int nums[], int target) {
    for (int i = 0; i < nums.length; i++) {
      if (target == nums[i])
        return i;
    }
    return -1;
  }

  public static int[] unionArray(int[] nums1, int[] nums2) {
    int i = 0, j = 0;
    Set<Integer> s = new HashSet<Integer>();
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] <= nums2[j]) {
        s.add(nums1[i]);
        i++;
      } else {
        s.add(nums1[j]);
        j++;
      }
    }
    while (j < nums2.length) {
      s.add(nums2[j]);
      j++;
    }
    while (i < nums1.length) {
      s.add(nums2[i]);
      i++;
    }
    int[] arr = new int[s.size()];
    int l = 0;
    for (int k : s) {
      arr[l] = k;
      l++;
    }
    return arr;
  }

  public static int missingNumber(int[] nums) {
    Arrays.sort(nums);
    System.out.println(Arrays.toString(nums));
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i)
        return res;
      res++;
    }
    return res;
  }

  public static int findMaxConsecutiveOnes(int[] nums) {
    int res=0,temp=0;
    for(int i:nums){
      if(i==1 )
        temp++;
      else
        temp=0;
      if(temp>res)
        res=temp;
    }
    return res;
  }

  public static int singleNumber(int[] nums){
    Map<Integer,Integer> m=new HashMap<Integer,Integer>();
    for(int i:nums)
      m.put(i,m.getOrDefault(i,0)+1);
    for(Map.Entry<Integer,Integer> i:m.entrySet()){
      if(i.getValue()==1)
        return i.getKey();
    }
    return 0;
  }

  public static int longestSubarray(int[] nums, int k) {
    int res=0,temp=0,cnt=0;
    for(int i=0;i<nums.length;i++){
      for(int j=i;j<nums.length;j++){
        if(temp>k){
          temp=0;
          cnt=0;
          break;
        }
        else if(temp<k){
          temp+=nums[j];
          cnt++;
        }
        else if(res<cnt){
          res=cnt;
          temp=0;
          cnt=0;
          break;
        }
      }
    }
    return res;
  }

  
}