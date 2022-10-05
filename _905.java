public class _905 {
   public static int[] segregateEvenOdd(int[] nums)
{
    int count=0;
    for(int i=0; i< nums.length; i++){
        if(nums[i]%2==0){
            int temp=nums[count];
            nums[count++]=nums[i];
            nums[i]=temp;
        }
    }
    return nums;
    }

    public static void main (String[] args)
    {
        int arr[] = {3,1,2,4};

        segregateEvenOdd(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
    }
}

