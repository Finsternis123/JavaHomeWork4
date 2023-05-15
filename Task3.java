package JavaWork.JavaHomeWork.JavaHomeWork4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(3);
        System.out.println(list);

        Iterator<Integer> col = list.iterator();
        
        int sum = 0;
        while (col.hasNext()){
            sum += col.next(); 
        }
        System.out.println(sum);
    }
}
