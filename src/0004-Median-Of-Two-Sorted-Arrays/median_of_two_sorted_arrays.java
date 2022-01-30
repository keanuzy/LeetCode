package 0004-Median-Of-Two-Sorted-Arrays;

public class median_of_two_sorted_arrays {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = merge(nums1, nums2);
        int mid = (mergedArray.length -1) / 2;
        
        if(mergedArray.length %2 != 0){
            return (double) mergedArray[mid];
        }else{
            return (double) (mergedArray[mid] + mergedArray[mid+1])/2;
        }
    }
    
    private int[] merge(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length + nums2.length];
        int i=0,j =0,k =0;
        
        while(i<nums1.length && j <nums2.length){
            if(nums1[i] <nums2[j]){
                res[k++] = nums1[i];
                i++;
            }else{
                res[k++] = nums2[j];
                j++;
            }
        }
        
        while(i<nums1.length){
            res[k++] = nums1[i++];
        }
        
        while(j<nums2.length){
            res[k++] = nums2[j++];
        }
        
        return res;
    }
}
