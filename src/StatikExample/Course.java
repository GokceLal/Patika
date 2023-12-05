package StatikExample;

public class Course {
    public String ad;
    public String kod;
    public int note;

    public Course(String ad, String kod, int note) {
        this.ad = ad;
        this.kod = kod;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ad='" + ad + '\'' +
                ", kod='" + kod + '\'' +
                ", note=" + note +
                '}';
    }
}

