import java.util.*;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> elements = new HashSet<Integer>();
        for (int num : nums) {
            if (elements.contains(num)) {
                return true;
            } else {
                elements.add(num);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicate checker = new ContainsDuplicate();
        int[] nums = {1, 2, 3, 4, 5, 6, 1};
        System.out.println(checker.containsDuplicate(nums)); // Output: true
    }
}
