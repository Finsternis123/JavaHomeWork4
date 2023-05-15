package JavaWork.JavaHomeWork.JavaHomeWork4;

import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> nums = new LinkedList<>();
        nums.add(2);
        nums.add(4);
        System.out.println(nums);
        System.out.println(((LinkedList<Integer>)nums).getFirst());
        ((LinkedList<Integer>) nums).addLast(3);
        System.out.println(nums);
        ((LinkedList<Integer>) nums).pollFirst();
        System.out.println(nums);
    }
}
