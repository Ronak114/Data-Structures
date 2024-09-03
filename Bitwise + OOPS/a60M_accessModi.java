public class a60M_accessModi {
    public static void main(String args[]) {
        // Bank Account
        BankAcc ba1 = new BankAcc();

        ba1.username = "Ronak"; // accessible (public)
        // ba1.password = "rtyui";//bcz password is not accessible(private).
        ba1.setPassword("abc");// to set the password

        // Getters and Setters
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(8);
        System.out.println(p1.getTip());

        p1.setColor("Yellow");
        p1.setColor("Yellow");
        System.out.println(p1.getColor());

    }
}

class Pen {
    private String color;
    private int tip;

    // getters
    String getColor() {
        return this.color;// this means current obj
    }

    int getTip() {
        return this.tip;
    }

    // setters
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;// this shows tip phle or "tip" new pass ki hue.
    }
}

class BankAcc {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}
