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
}
