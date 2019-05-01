import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionDemo {

    public void functionTest(Student student, Predicate<Student> predicate) {
        if (predicate.test(student)) {
            System.out.println(student.getFirstName() + student.getLastName());
        }
    }

    public void consumerTest(Student student, Consumer<Student> consumer) {
        consumer.accept(student);
    }

    public String functionTest(Student student, Function<Student, String> function) {
        return function.apply(student);
    }

    public Integer supplierTest(Supplier<Integer> supplier) {
        return supplier.get();
    }
}
