package worksheets.TwoPointer.app;

import worksheets.TwoPointer.utils.ArrayUtils;

import java.util.Random;

public class TestSum {
    public static void main(String[] args) {
        Random rg = new Random();
        int[] nums = new int[20];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rg.nextInt(100);
        }

        System.out.println("---------------------------");
        ArrayUtils.displayArrayHorizontal(nums);
        System.out.println("---------------------------");





        int[] sum = ArrayUtils.sum(nums, 100);
        System.out.println("Sum: " + sum[0] + ", " + sum[1]);
    }
}
