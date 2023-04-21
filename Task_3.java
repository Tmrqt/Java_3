import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Task_3 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));
        System.out.println("min = " + list.stream().mapToInt(val -> val).average().orElse(0.0));
    }
}
