public class a67M_interface_multi_inheri {
    /********To shoe multiple inheritance******  */
    public static void main(String args[]){
        bear b=new bear();
        b.eatMeat();
        b.eatGrass();
    }
    
}
interface herbivore{
    void eatGrass();
}
interface carnivore{
    void eatMeat();
}
class bear implements herbivore,carnivore{
    public void eatGrass(){
        System.out.println("they eat grass");
    }

    public void eatMeat(){
        System.out.println("they eat meet");
    }
}

