import java.util.*;

public class MediumArray {
  public static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      if (m.containsKey(target - nums[i]))
        return new int[] { m.get(target - nums[i]), i };
      m.put(nums[i], i);
    }
    return new int[] { -1, -1 };
    // bruteforce approach

    // int[] res = new int[2];
    // x:
    // for (int i = 0; i < nums.length - 1; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // res[0] = i;
    // res[1] = j;
    // break x;
    // }
    // }
    // }
    // return res;
  }

  public static void sortZeroOneTwo(int[] nums) {
    int cnt0 = 0, cnt1 = 0;
    for (int i : nums) {
      if (i == 0)
        cnt0++;
      else if (i == 1)
        cnt1++;
    }
    for (int i = 0; i < nums.length; i++) {
      if (cnt0 > 0) {
        nums[i] = 0;
        cnt0--;
      } else if (cnt1 > 0) {
        nums[i] = 1;
        cnt1--;
      } else
        nums[i] = 2;
    }
  }

  public static int majorityElement(int[] nums) {
    Map<Integer, Integer> m = new HashMap<Integer, Integer>();
    for (int i : nums)
      m.put(i, m.getOrDefault(i, 0) + 1);
    int key = 0, value = 0;
    for (Map.Entry<Integer, Integer> i : m.entrySet()) {
      if (i.getValue() > value) {
        key = i.getKey();
        value = i.getValue();
      }
    }
    return key;
  }

  // kadane's algorithm
  public static int[] maxSubArray(int[] nums) {
    int temp = 0, max = Integer.MIN_VALUE, st = 0, end = -1, strt = -1;
    for (int i = 0; i < nums.length; i++) {
      if (temp == 0)
        st = i;
      temp += nums[i];
      if (temp > max) {
        max = temp;
        strt = st;
        end = i;
      }
      if (temp < 0) {
        temp += 0;
      }
    }
    int[] arr = new int[end - strt + 1];
    int n = end - strt;
    for (int i = 0; i <= n && strt <= end; i++, strt++) {
      arr[i] = nums[strt];
    }
    return arr;
  }

  public static int stockBuySell(int[] arr) {
    int min = arr[0], max = 0;
    for (int i : arr) {
      if (min >= i) {
        min = i;
        continue;
      } else if (max < i)
        max = i;
    }
    if (max - min > 0)
      return max - min;
    return 0;
  }

  // 2, 4, 5, -1, -3, -4
  public static int[] rearrangeArray(int[] nums) {
    int[] arr = new int[nums.length];
    Arrays.sort(nums);
    int i = (nums.length / 2) - 1, j = i + 1;
    for (int k = 0; k < arr.length; k += 2) {
      arr[k] = nums[j];
      arr[k + 1] = nums[i];
      j++;
      i--;
    }
    return arr;
  }

  public static void nextPermutation(int[] nums) {
    int i = nums.length - 1;
    int[] temp = new int[i+1];
    while (i > 0) {
      if (nums[i] > nums[i - 1])
        break;
      i--;
    }
    if (i == 0) {
      for (int j = 0, k = nums.length-1; j < nums.length; j++,k--) 
        temp[j]=nums[k];
    } else {
      int x = nums[i];
      nums[i] = nums[i - 1];
      nums[i - 1] = x;
      for (int j = 0; j < i; j++) {
        temp[j] = nums[j];
      }
      int[] temp1 = new int[nums.length - i];
      for (int j = 0, k = i; j < temp1.length; j++, k++) {
        temp1[j] = nums[k];
      }
      Arrays.sort(temp1);
      x = 0;
      while (i < nums.length) {
        temp[i] = temp1[x];
        i++;
        x++;
      }
    }
    System.arraycopy(temp, 0, nums, 0, nums.length);
  }

}