package JavaWork.JavaHomeWork.JavaHomeWork4;

import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(12);
        nums.add(7);
        nums.add(5);
        nums.add(2);
        nums.add(3);
        nums.add(22);
        nums.add(12);
        System.out.println(nums);
        Collections.sort(nums, Collections.reverseOrder());
		System.out.println(nums);
    }
}
