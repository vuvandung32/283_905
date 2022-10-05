public class _283 {

        public static void moveZeroes(int[] nums ,int n) {
            int count = 0;
            for (int i = 0; i < n; i++)
                if (nums[i] != 0)
                    nums[count++] = nums[i];

            while (count < n)
                nums[count++] = 0;
        }
        public static void main(String[] args) {
            int nums[] = {0,1,0,3,12};
            int n = nums.length;
            moveZeroes(nums,n);

            for (int i=0; i<n; i++)
                System.out.print(nums[i]+" ");


        }
}
