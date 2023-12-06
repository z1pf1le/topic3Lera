package adresCheloveka.findmax;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Set<MyClass> objects = new HashSet<>();
        objects.add(new MyClass(10));
        objects.add(new MyClass(25));
        objects.add(new MyClass(7));

        MyClass maxObject = findObjectWithMaxValue(objects);
        System.out.println("Объект с наибольшим значением: " + maxObject.getValue());
    }

    public static MyClass findObjectWithMaxValue(Set<MyClass> objects) {
        return objects.stream()
                .max(Comparator.comparingInt(MyClass::getValue))
                .orElse(null);
    }
}