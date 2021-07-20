package Bt1;

public class Product  {
    private String id;
    private String ten;
    private int soLuong;
    private int donGia;

    public Product() {
    }

    public Product(String id, String ten, int soLuong, int donGia) {
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String toString() {
        return "id :" + id
                + ", Ten : " + ten
                + ", So Luong : " + soLuong
                + ", Don gia :" + donGia;

    }
}
