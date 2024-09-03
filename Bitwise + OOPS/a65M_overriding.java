 public class a65M_overriding {

    public static void main(String args[]) {
        Deer d = new Deer();
        d.eat();//child class ko he call krenga
        Animal a=new Animal();
        a.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eat everything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}

