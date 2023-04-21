import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task_2 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        for (int i = list.size(); i-- > 0;) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
