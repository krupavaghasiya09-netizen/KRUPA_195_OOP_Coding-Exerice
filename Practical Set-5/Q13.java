class A {
    public int pub=10;
    protected int prot=20;
    private int priv=30;
}

class B extends A {
    void display(){
        System.out.println(pub);
        System.out.println(prot);
    }
}

class C {
    void display(){
        A a=new A();
        System.out.println(a.pub);
    }
}

public class Main {
    public static void main(String[] args){
        B b=new B();
        C c=new C();

        b.display();
        c.display();
    }
}
