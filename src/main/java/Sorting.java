

public class Sorting {
    public static int[] selectionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<=nums[i]){
                    nums[i]+=nums[j];
                    nums[j]=nums[i]-nums[j];
                    nums[i]=nums[i]-nums[j];
                }
            }
        }
        return nums;
    }
    
    public static int[] bubbleSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j]){
                    nums[j-1]+=nums[j];
                    nums[j]=nums[j-1]-nums[j];
                    nums[j-1]=nums[j-1]-nums[j];
                }
            }
        }
        return nums;
    }

    public static int[] insertionSort(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=i;j>0;j--){
                if(nums[j-1]>nums[j]){
                    nums[j-1]+=nums[j];
                    nums[j]=nums[j-1]-nums[j];
                    nums[j-1]=nums[j-1]-nums[j];
                }
                else
                    break;
            }
        }
        return nums;
    }

    public static int[] mergeSort(int[] nums) {
        // int len=nums.length;
        // if(len==1) return nums;
        // int mid=len/2;
        // int[] nums1=new int[mid];
        // int[] nums2=new int[len-mid];
        // if(len>1){
        //     for(int i=0;i<mid;i++)
        //         nums1[i]=nums[i];
        //     for(int i=mid+1;i<len;i++)
        //         nums2[i-mid+1]=nums[i];
        //     mergeSort(nums1);
        //     mergeSort(nums2);
        // }
        // merge(nums);
        return nums;
    }

    public static int[] merge(int[] nums,int mid,int len) {
        
        return nums;
    }
}