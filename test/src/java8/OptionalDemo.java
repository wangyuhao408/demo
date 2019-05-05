package java8;

import java.util.Optional;

public class OptionalDemo {

  public Integer sum(Optional<Integer> a, Optional<Integer> b) {
    System.out.println("第一个参数值存在: " + a.isPresent());
    System.out.println("第二个参数值存在: " + b.isPresent());
    Integer value1 = a.orElse(new Integer(0));
    Integer value2 = b.get();
    return value1 + value2;
  }

  public Optional<Object> optionalOfTest() {
    return Optional.of(null);
  }

  public Optional<Object> optionalOfNullableTest() {
    return Optional.ofNullable(null);
  }

  public String mapAndOrElseTest(Student student) {
    return Optional.ofNullable(student)
        .map(student1 -> student1.getFirstName())
        .orElse("Unknown");
  }

  public boolean isPresentTest(Optional<Student> student) {
    return student.isPresent();
  }

  public Optional emptyTest() {
    return Optional.empty();
  }

  public Optional filterTest(Optional<Student> student) {
    return student.filter(student1 -> student1.printIsPass());
  }

  public Optional flatMapTest(Optional<Student> student) {
    return student.flatMap(student1 -> Optional.of(student1.getGrade() - student1.passGrade));
  }
}
