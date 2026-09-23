package in_class_week2;

public class demointarray {
    static void main(){
        /**
         * creates an array of numbers and calls displayArray to display them
         * creates an array of names and calls displayArray to display them
         */
        int [] nums = {423, 265, 1, 67, 100, 89};
        String [] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank"};


        ArrayUtils.displayArray(nums);
        System.out.println("---------------------------");
        ArrayUtils.displayArray(names);
    }
}
