package java8;

import java.util.Optional;

public class OptionalDemo {
    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("��һ������ֵ����: " + a.isPresent());
        System.out.println("�ڶ�������ֵ����: " + b.isPresent());
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
}
