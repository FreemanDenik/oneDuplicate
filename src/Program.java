import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] str){
        List<Integer> arr = IntStream.range(1, 101).boxed().collect(Collectors.toList());
        arr.set(4, 89);

        int duplicateSum = arr.stream().distinct().mapToInt(e->e).sum();
        int totalSum = arr.stream().mapToInt(e->e).sum();
        int result = totalSum - duplicateSum;
        System.out.println("Число которое повторяется " + result);
    }
}
