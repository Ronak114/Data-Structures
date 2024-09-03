public class a61M_constructor {

    /*************** REMEMBER*************** */
    // public static void main(String args[]) {
    // Student s1= new Student(); // non-parameterized Student constructor called.
    // System.out.println(s1.name); // op null..bcz parameterized constructor is
    // called.
    // // in prev ex : in java when we dont call constructor...default constructor
    // is made.

    // Student s2 = new Student("Ronak");
    // System.out.println(s2.name);
    // }

    public static void main(String args[]) {

        // constructor overloading (example of polymorphism)...choosing constructor as
        // per our need.
        Student s1 = new Student();
        Student s2 = new Student("Ronak");
        Student s3 = new Student(123);

        // Student s4= new Student("Ronak",567);..give error bcz we dont have this
        // constructor.
    }
}

class Student {
    String name;
    int roll;

    // Non-parameterized Constructor.
    Student() {
        System.out.println("Constructor is called..");
    }

    // Parameterized Constructor.
    Student(String Name) {
        this.name = Name;
        System.out.println(name);
    }

    Student(int Roll) {
        this.roll = Roll;
    }
}