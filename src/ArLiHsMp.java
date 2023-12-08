import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArLiHsMp{
    public static void main(String[] args) {
//        ArrayList cats = new ArrayList();
//        Integer i = 1;
//        String s = "s";
//        cats.add(i);
//        cats.add(s);

        Stream<Integer> numStream = Stream.of(43, 65, 1, 98, 63);
        List<Integer> nList = numStream.map(n -> n*10) .peek(n->System.out.println("Mapped: "+ n)) .collect(Collectors.toList());
        System.out.println(nList);
    }
}
