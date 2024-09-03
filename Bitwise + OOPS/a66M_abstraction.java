public class a66M_abstraction {
    public static void main(String args[]){
        Original o=new Original();
        o.eat();
        System.out.println();
        o.drink();
        System.out.println();
        

        hybrid h=new hybrid();
        h.eat();
        h.drink();

       // Vampire v=new Vampire() {};..cannot create as it is a abstract class
    }
}
abstract class Vampire{
    String color;

    // constructor
    Vampire(){
       System.out.println("Vampire con is called");
    }
    //non abstract method
    void eat(){
        System.out.println("vampires drink blood");
    }
    //abstract method-(no implementation)
    abstract void drink();
    //how will be the drink funtn ....will be shown by subclass (not by vampire class)
}

class Original extends Vampire{
   Original(){
    System.out.println("orig cons is called");
   }
    //now it is compulsary to use drink funtn.
    void drink(){
        System.out.println("drinks human blood");
    }
}
 
class hybrid extends Vampire{
    void changeColor(){
        color="dark brown";
    }
    void drink(){
        System.out.println("ertyuiop");
    }
}
