import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<Integer>();

        deque.add(54);
        deque.add(55);
        deque.add(56);
        deque.add(58);
        deque.add(59);
        deque.addLast(79);
        deque.add(51);

        System.out.println(deque.removeFirst());



    }
}
