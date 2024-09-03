public class a62M_copyConst {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Ronak";
        s1.roll = 22;
        s1.pwd = "xyz";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);// doing copy.
        s2.pwd = "abc";
        System.out.println(s2.pwd);

        // printing the mrks of s2...(same as s1)
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        s1.marks[2] = 800;// s1 value is changed so s2 also changes.
        // printing the mrks of s2.
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        // but in shalloe CC it will change
    }
}

class Student {
    String name;
    int roll;
    String pwd;
    int marks[];

    Student() {
        // To identify we should mention the array.
        marks = new int[3];
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;// array nhi..reference copy hua hai.
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];//value copy ki
        }
    }
}
