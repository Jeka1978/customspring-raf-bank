package my_spring;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min = 3,max = 7)
    private int repeat;
    public void clean() {
        IntStream.range(0, repeat)
                .mapToObj(i -> "VVVVVVVVVVvvvvvvvvvvvvvv")
                .forEach(System.out::println);
    }
}
