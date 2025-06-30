import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static int mostFrequentElement(int[] nums) {
     Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int r=0,s=0;
        for(int i=nums.length-1;i>=0;i--){
            m.put(nums[i],(m.getOrDefault(nums[i],0)+1));
        }

        for(Map.Entry<Integer,Integer> i:m.entrySet()){
            if(i.getValue()>r){
                r=i.getValue();
                s=i.getKey();
            }
            else if(i.getValue()==r){
                if(i.getKey()<s)
                    s=i.getKey();
            }
                
            
        }
        return s;
    }

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length-1;
        for(int i=len;i>=0;i--){
            if(i>0 && k>=nums[i]-nums[i-1]){
                k-=nums[i]-nums[i-1];
                nums[i-1]+=nums[i]-nums[i-1];
            }
        }
        Map<Integer,Integer> m=new HashMap<Integer,Integer>();
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            m.put(nums[i],(m.getOrDefault(nums[i],0)+1));
        }

        for(Map.Entry<Integer,Integer> i:m.entrySet()){
            if(i.getValue()>r)
                r=i.getValue();
        }
        return r;
    }
}