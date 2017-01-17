interface A{
    void methodA();
}

interface B extends A{
    void methodB();
}

interface C extends A{
    void methodC();
}

class D implements B, C{
    public void methodA(){
        System.out.println("invoke methodA");
    }
    public void methodB(){
        System.out.println("invoke methodB");
    }
    public void methodC(){
        System.out.println("invoke methodC");
    }
    
    public static void main(String[] args){
        HierarchicalInheritance obj = new HierarchicalInheritance();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
