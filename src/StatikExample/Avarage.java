package StatikExample;

public class Avarage {
    public int not1;
    public int not2;
    public int not3;
    public int total;

    public Avarage(int not1, int not2, int not3) {
        this.not1 = not1;
        this.not2 = not2;
        this.not3 = not3;
    }

    @Override
    public String toString() {
        return "Avarage{" +
                "not1=" + not1 +
                ", not2=" + not2 +
                ", not3=" + not3 +
                ", total=" + total +
                '}';
    }


    public void getTotal(int []notes) {

        total=(not1+ not2+not3)/3;

    }

}
