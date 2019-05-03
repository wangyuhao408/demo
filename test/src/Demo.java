import java7.ByteBufferDemo;
import java7.NumberChangeDemo;
import java7.PathNewApiDemo;
import java7.SwitchDemo;
import java8.*;

import java.io.IOException;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) throws IOException {
        //java8
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
        //java7
        SwitchDemo switchDemo = new SwitchDemo();
        NumberChangeDemo numberChangeDemo = new NumberChangeDemo();
        PathNewApiDemo pathNewApiDemo = new PathNewApiDemo();
        ByteBufferDemo byteBufferDemo = new ByteBufferDemo();

        System.out.println(numberChangeDemo.addBinary().toString() + "  "
                + numberChangeDemo.addUnderLine().toString());
        System.out.println(switchDemo.generate("wangyuhao", "ÄÐ"));
        pathNewApiDemo.pathTest();
        byteBufferDemo.useByteBuffer();
    }
}
