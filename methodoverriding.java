class info {
    public void personalInfo() {
        System.out.println("MY NAME IS KUMUD ZIMAL");
        System.out.println("MY AGE IS 19");

    }
}

class info2 extends info {
    public void personalInfo() {
        super.personalInfo();
        System.out.println("I AM PURSUING COMPUTER SCIENCE ENGINEERING");
        System.out.println("MY CLG IS VCET,VASAI");
    }

}

public class methodoverriding {
    public static void main(String[] args) {
        info i = new info();
        info2 i2 = new info2();
        i.personalInfo();

    }
}
