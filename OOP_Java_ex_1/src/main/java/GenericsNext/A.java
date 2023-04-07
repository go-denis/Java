package GenericsNext;

public class A {
//
}

class B extends A{
//
}

class C extends B{
//
}

class D extends C{
    ///
}

class Gen2<T>{
    T ob;
    public Gen2(T ob){
        this.ob = ob;
    }

    static void test(Gen2<?super B> ob){

    }
}

class Gen3{
    static void test(Gen2<?super B> ob){

    }

    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        Gen2<A> w = new Gen2<A>(a);
        Gen2<B> w2 = new Gen2<B>(b);
        Gen2<C> w3 = new Gen2<C>(c);
        Gen2<D> w4 = new Gen2<D>(d);

        test(w);
        test(w2);
        //test(w3);
        //test(w4);
    }
}