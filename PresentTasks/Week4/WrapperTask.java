package PresentTasks.Week4;

public class WrapperTask {
    public static void main(String[] args) {
        char [] values = {'1', 'a', '3', 'z', '9'};
        int [] nums = {10, 0, -4, 20, 5};
        System.out.println("Primitive numbers count: " + countDigit1(values));
        System.out.println("Non-primitive numbers count: " + countDigit2(values));
        System.out.println("Primitive max number: " + findMax1(nums));
        System.out.println("Non-primitive max number: " + findMax2(nums));

    }

    // Task1: Primitive numbers count
    public static int countDigit1(char[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            int ascii = (int) values[i];
            if (ascii >= 48 && ascii <= 57) count++;
        }
        return count;
    }
    // Task2: Non-primitive digits count 
    public static int countDigit2(char[] values) {
        int count = 0;
        for (char value : values) {
            if (Character.isDigit(value)) count++;
        }
        return count;
    }

    // Task3: Primitive find max number
    public static int findMax1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    // Task4: Non-primitive find max number
    public static int findMax2(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (Integer.compare(nums[i], max) > 0) {
                max = nums[i];
            }
        }
        return max;
    }
}
