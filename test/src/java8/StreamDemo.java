package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StreamDemo {

  Random random = new Random();
  private List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

  public void forEachTest() {
    strings.stream().forEach(s -> System.out.println(s));
  }

  public void mapTest() {
    strings.stream().map(s -> s + " ").forEach(s -> System.out.println(s));
  }

  public void filterTest() {
    strings.stream().filter(s -> s.equals("abc")).forEach(s -> System.out.println(s));
  }

  public void limitTest() {
    random.ints().limit(10).forEach(System.out::println);
  }

  public void sorted() {
    Random random = new Random();
    random.ints().limit(10).sorted().forEach(System.out::println);
  }

  public void parallelTest() {
    strings.parallelStream().filter(s -> s.isEmpty()).forEach(System.out::println);
  }
}
