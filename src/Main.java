import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    int a1;
    public static void main(String[] args){
        A a = new A();
        try {
            System.out.println("0");
            a.f();
        } catch (IOException ex) {
            System.out.println("1");
        } catch (Exception ex) {
            System.out.println("2");
        } finally {
            System.out.println("3");
        }

    }
}

class A {
    public A() {
        System.out.println("A");
    }
    public void f() throws IOException {

    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }

    @Override
    public void f() throws IOException{

    }
}

abstract class Dongvat {
    public abstract void chay();
    public abstract void keu();
}

class Cho extends Dongvat {
    @Override
    public void chay() {
        System.out.println("con chay bang 4 chan");
    }

    @Override
    public void keu() {
        System.out.println("con cho sua gau gau");
    }
}

class Ga extends Dongvat {
    @Override
    public void chay() {
        System.out.println("con ga chay bang 2 chan");
    }

    @Override
    public void keu() {
        System.out.println("con ga gay 0 0 0 ");
    }
}

interface Tangai{
    public void canTay();
    void hon();
}

class Nguoi implements Tangai {
    @Override
    public void canTay() {
        System.out.println("cam tay nhu nao");
    }

    @Override
    public void hon() {
        System.out.println("hon nu nao");
    }
}

