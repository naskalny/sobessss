import java.util.*;

public class LeetCode {
    public static void main(String[] args) {

//        int[] nums = {1,1,1,2,2,3};
//        System.out.println(removeDuplicates1(nums));
        int[] array = {1, 2, 3, 4, 5};

        // Использование Stream API для вычисления суммы всех элементов массива
        int sum = Arrays.stream(array).sum();

        System.out.println("Сумма всех элементов массива: " + sum);

    }

    //80. Удаление дубликатов из отсортированного массива II
    public static int removeDuplicates1(int[] nums) {

        int p = 0, c = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[p] == nums[i]) {
                if (c < 2) {
                    c++;
                    nums[++p] = nums[i];
                }
            } else {
                c = 1;
                nums[++p] = nums[i];
            }
        }
        return ++p;

    }

    //26. Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    //27. Remove Element
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    //88. Merge Sorted Array
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;
        int pMerge = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge--] = nums1[p1--];
            } else {
                nums1[pMerge--] = nums2[p2--];
            }
        }
    }

    public enum DayOfWeek {

        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
