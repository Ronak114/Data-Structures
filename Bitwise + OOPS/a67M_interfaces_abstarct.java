public class a67M_interfaces_abstarct {
    /********To show abstraction******* */
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();

    }
}
interface ChessPlayer{
    void moves();//by default public,abstract & cant write the implementation bcz we need to implement interface

    //************abstraction kaise hua..bass idea diya hai move ka define toh badmai he kiya n*************
}

class Queen implements ChessPlayer{
    public void moves(){//public nhi likhenge toh by-default default hojayenga.
        System.out.println("Up,Down,Left,Right,Diag(in all 4 directn)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){//public nhi likhenge toh by-default default hojayenga.
        System.out.println("Up,Down,Left,Right");
    }
}
class Camel implements ChessPlayer{
    public void moves(){//public nhi likhenge toh by-default default hojayenga.
        System.out.println("Diag(in all 4 directn)");
    }
}
class king  implements ChessPlayer{
    public void moves(){//public nhi likhenge toh by-default default hojayenga.
        System.out.println("Up,Down,Left,Right,Diag - by 1 step");
    }
}
