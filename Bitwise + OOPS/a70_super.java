public class a70_super {
    public static void main(String args[]){
        horse h=new horse();
        System.out.println(h.color);

    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal cons is called");
    }
}

class horse extends Animal{
    horse(){
        super.color="white";
        //ek he super chahiye
        //super();
        //bcz of this imediate parent class is called bro super nhi likhte toh bhi yahi hota bcz java bydeafault usse call kr leta
        System.out.println("horse cons is called");
    }
}
