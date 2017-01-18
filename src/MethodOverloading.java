public class MethodOverloading {
    void methodA(int id, String nama){ //method dengan 2 parameter bertipe int dan String
        System.out.println("ini method A dengan 2 parameter "+ id + " "+ nama);
    }
    void methodA(String kampus){ //method dengan nama method yang sama tetapi hanya mempunyai satu parameter String
        System.out.println("ini parameter dengan satu parameter " + kampus);
    }
    
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        obj.methodA("uhamka"); //memanggil methodA dengan satu parameter String
        obj.methodA(22, "adha"); //memangil methodA dengan 2 parameter int dan String
    }
}
