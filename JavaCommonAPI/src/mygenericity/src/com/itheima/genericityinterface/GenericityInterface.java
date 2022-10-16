package mygenericity.src.com.itheima.genericityinterface;

interface Genericity<E> {
    public abstract void method(E e);
}

public class GenericityInterface {
    public static void main(String[] args) {
        GenericityImpl1<String> genericity = new GenericityImpl1<>();
        genericity.method("小丽给我的土味情话");

        GenericityImpl2 genericityImpl2 = new GenericityImpl2();
        genericityImpl2.method(19);
    }
}

class GenericityImpl2 implements Genericity<Integer> {

    @Override
    public void method(Integer integer) {
        System.out.println(integer);
    }
}


class GenericityImpl1<E> implements Genericity<E> {

    @Override
    public void method(E e) {
        System.out.println(e);
    }
}