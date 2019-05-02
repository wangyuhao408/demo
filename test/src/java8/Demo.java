package java8;

import java.io.UnsupportedEncodingException;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        StreamDemo streamDemo = new StreamDemo();
        FunctionDemo functionDemo = new FunctionDemo();
        Student student = new Student("wang", "yu", 80);
        OptionalDemo optionalDemo = new OptionalDemo();
        DateTimeDemo dateTimeDemo = new DateTimeDemo();
        Base64Demo base64Demo = new Base64Demo();

        streamDemo.filterTest();
        streamDemo.forEachTest();
        streamDemo.limitTest();
        streamDemo.parallelTest();
        streamDemo.mapTest();

        functionDemo.predicateTest(student, student1 -> student1.printIsPass());
        functionDemo.consumerTest(student, student1 -> student1.passGrade = 70);
        System.out.println(functionDemo.functionTest(student, student1 -> student1.getGrade() - student1.passGrade));

        student.print();

        System.out.println(optionalDemo.sum(Optional.ofNullable(null), Optional.ofNullable(1)));

        dateTimeDemo.localDateTimeTest();
        dateTimeDemo.zoneDateTime();

        base64Demo.base64DemoTest();
    }
}
