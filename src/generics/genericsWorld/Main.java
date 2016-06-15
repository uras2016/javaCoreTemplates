package generics.genericsWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class A<T> {
    public T value;
}
class B extends A {}

class Clazz {
    B b = new B();
    void test() {
        System.out.println(b.value);
    }
}

class BaseProduct extends Product {
    @Override
    public String toString() {
        return "BaseProduct";
    }
}

class Product {
    public float price;

    @Override
    public String toString() {
        return "Product";
    }
}

class Notebook extends Product {

    @Override
    public String toString() {
        return "Notebook";
    }
}

class Camera extends Product {
    @Override
    public String toString() {
        return "Camera";
    }
}

class Phone extends Product {
    @Override
    public String toString() {
        return "Phone";
    }
}

class SmartPhone extends Phone {
    @Override
    public String toString() {
        return "Smart" + super.toString();
    }
}

/*
Explicit - неявно
Implicit - явно
                                        Object (1)
                                          |
                                          |
                                          v
                                  (2)   Product   ---> (3) Phone ---> (4) SmartPhone
                                       /       \
                                      /         \
                                     /           \
                             (3) Notebook    (3) Camera
 */

// *********************************************************************************************************************

class CollectionUtils<T> {

    public static <T> void printCollection(Collection<? extends T> collection) {
        for (T item : collection) {
            System.out.println(item);
        }
    }

    public static <T> void addToCollection(Collection<? super T> collection, T t) {
        collection.add(t);
    }

    public static <T> void fillCollection(Collection<? super T> collection, T t) {
        // ...

    }

    public static void test(List<? extends Product> list) {
        System.out.println( ((Product)list.get(0)).price );
    }

    public static void test2(List<?> list) {
        list.add(null);
        list.get(0);
    }

    public static void test3(List<? super Phone> list) {
        System.out.println(list.get(0));
    }

}

public class Main {

    public static void main(String[] args) {

        CollectionUtils<Phone> utils = new CollectionUtils<>();

        List<Product> productList = new LinkedList<>();
        List<SmartPhone> smartPhoneList = new LinkedList<>();
        List<Phone> phoneList = new LinkedList<>();
        List<Camera> cameraList = new LinkedList<>();

        List<? super Phone> someList1 = new LinkedList<>();
        List<? extends Phone> someList2 = new LinkedList<>();

//        someList2.add(new SmartPhone());    // compile error

        someList1 = phoneList;
        someList1.add(new SmartPhone());
//        someList.add((SmartPhone) new Phone()); // ClassCastException
//        someList.add(new Phone());              // Compile-time error

//        CollectionUtils.fillCollection(phoneList, new Camera()); // compile error

        CollectionUtils.addToCollection(smartPhoneList, new SmartPhone());
        CollectionUtils.addToCollection(new ArrayList<Object>(), new Object());
        CollectionUtils.addToCollection(productList, new SmartPhone());
        CollectionUtils.addToCollection(productList, new Phone());
        CollectionUtils.addToCollection(productList, new Product());
        CollectionUtils.addToCollection(productList, new Camera());
        CollectionUtils.addToCollection(productList, new BaseProduct());
        CollectionUtils.addToCollection(phoneList, new Phone());
        CollectionUtils.addToCollection(someList1, new SmartPhone());
        CollectionUtils.printCollection(productList);
        System.out.println();
        CollectionUtils.test(productList);

        CollectionUtils.test3(phoneList);
    }
}