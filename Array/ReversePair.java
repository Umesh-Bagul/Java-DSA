public class ReversePair {

    public static long reversePair(int[] nums){
        int low = 0;
        int high = nums.length - 1;

        return mergeSort(nums, low, high);
    }

    public static long mergeSort(int nums[], int low, int high){
        long count = 0;

        int mid = low + (high - low)/2;

        if(low >= high){
            return count;
        }

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += count(nums, low, mid, high);

        merge(nums, low, mid, high);

        return count;

    }

    public static long count(int[] nums, int low, int mid, int high){
        long count = 0;

        int right = mid + 1;

        for(int left = low; left<=mid; left++){
            while(right <= high && 2*(long)nums[right] < (long)nums[left]){
                     right++;
            }
            count += right - (mid+1);
        }

        return count;
    }

    public static int[] merge(int[] nums, int low, int mid, int high){

        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        while(i<=mid){
            temp[k++] = nums[i++];
        }

        while(j<=high){
              temp[k++] = nums[j++];
        }

        for(int l = 0; l<temp.length; l++){
            nums[low+l] = temp[l];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 4, 1, 2, 7};

        System.out.println(reversePair(arr));
    }

}
