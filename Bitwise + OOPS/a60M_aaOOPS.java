//alys code other classes below public class..bcz it will give error while creating obj...but still works

class Pen {// blueprint of class pen.

    // properties + funtn.
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

public class a60M_aaOOPS {
    public static void main(String args[]){
        //for creat ing a obj.
        Pen p1= new Pen();
        //Pen() -> constructor
        
        p1.setColor("Blue");
        System.out.println(p1.color);
        
        p1.setTip(8);
        System.out.println(p1.tip);

        // p1.setColor("Yellow");
        p1.color="Yellow";
        System.out.println(p1.color);
    }
}



// class Student{
//     String name;
//     int age;
//     float percentage;

//     void calPer(int phy,int chem,int maths){
//         percentage = (phy+chem+maths)/3;
//     }
// }
