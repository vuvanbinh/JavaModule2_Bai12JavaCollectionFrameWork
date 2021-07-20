package th2;

public class Student {
    private String ten;
    private int tuoi;
    private String diachi;

    public Student() {
    }

    public Student(String ten, int tuoi, String diachi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
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

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public  String toString(){
        return "Thong tin hoc sinh : "+
                ",  Ten : "+  ten
                +", Tuoi : "+ tuoi
                +", Dia chi : " + diachi;
    }
}
