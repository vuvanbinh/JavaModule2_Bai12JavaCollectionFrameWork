package TH3;

public class Student implements Comparable<Student> {
    private String ten;
    private int tuoi;
    private String diaChi;

    public Student() {
    }

    public Student(String ten, int tuoi, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String toString(){
        return "  Ten : "+ ten
                +", Tuoi : "+ tuoi
                + ", Dia chi : " + diaChi;
    }

    @Override
    public int compareTo(Student student) {
        return this.getTen().compareTo(student.getTen());
    }
}
