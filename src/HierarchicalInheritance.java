class A{
    void methodA(){
        System.out.println("memanggil method A");
    }
}

class B extends A{
}

class C extends A{
    
}

class D extends A{
    
}

public class HierarchicalInheritance {
    public static void main(String[] args){
        B objb = new B();
        C objc = new C();
        D objd = new D();
        objb.methodA();
        objc.methodA();
        objd.methodA();
    }
    
}
