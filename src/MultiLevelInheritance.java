class MultiLevelInheritance { //super class A
    void test(){
        System.out.println("inheritance super class");
    }
}


class MultiLevelInheritance1 extends MultiLevelInheritance{ //menurunkan method dari class MultiLevelInheritance diatas 
    void test1(){
        System.out.println("inheritance subclass");
    }
}


class MultilevelInheritance2 extends MultiLevelInheritance1{ //menurunkan method dari class MultiLevelInheritance dan MultiLevelInheritance1
    
    public static void main(String[] args){
        MultilevelInheritance2 obj1 = new MultilevelInheritance2();
        obj1.test(); //memanggil method yang ada di MultiLevelInheritance1 yang sudah di turunkan dari class MultiLevelInheritance
        obj1.test1(); //memanggil method yang ada di MultiLevelInheritance1
    }
}

