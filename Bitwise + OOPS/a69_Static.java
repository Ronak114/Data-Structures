public class a69_Static {
    public static void main(String args[]) {
        student s1 = new student();
        s1.SchoolNAme = "Alphonsa";

        student s2 = new student();
        System.out.println(s1.SchoolNAme);
        System.out.println(s2.SchoolNAme);
        // all student will ahve same schoolname..as alphonsa

        student s3 = new student();
        s3.SchoolNAme = "St.John";

        System.out.println(s1.SchoolNAme);
        //now svhoolNAmw will be st.john for all the students 

        /*******Static obj memory mai ek he baar banti hai****** */
       System.out.println(s1.returnPercentage(87,88,98));
    }
}

class student {
    String StudName;
    int roll;
    static String SchoolNAme;

    void setName(String Name) {
        this.StudName = Name;
    }

    String getName() {
        return this.StudName;
    }

    static int returnPercentage(int math,int phy,int chem){
        return (math+phy+chem)/3;
    }
}
