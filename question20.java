public class question20 {
    public static int maxProduct(int[] nums){
        if(nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for(int i = 1; i < nums.length; i++){
            int current = nums[i];

            if(current < 0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(current, current * maxProduct);
            minProduct = Math.min(current, current * minProduct);

               result = Math.max(result, maxProduct);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,-2,4};
        System.out.println("maximum product subarray: " +maxProduct(nums));
    }
    
}
