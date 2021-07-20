package Bt1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Comparator<Product> {
    List<Product> products = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in);

    public void themSp(Product product){
        products.add(product);
    }
    public void hienThi(){
        for (Product t: products
             ) {
            System.out.println(t.toString());
        }
    }

    public Product newSp(){
        System.out.println(" Nhap id : ");
        String id = sc.nextLine();
        System.out.println(" Nhap ten san pham : ");
        String ten = sc.nextLine();
        System.out.println(" Nhap so luong :  ");
        int soLuong = sc.nextInt();
        System.out.println(" Nhap don gia : ");
        int donGia = sc.nextInt();
        Product newProduct = new Product(id,ten,soLuong,donGia);
        return newProduct;
    }

    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId().equals(id)){
                index = i;
                break;
            }
        } return index;
    }

    public void suaSp(){
        System.out.println(" Nhap id can sua :");
        String id = sc.nextLine();
        products.set(getIndex(id),newSp());
    }
    public void xoaSp(){
        System.out.println(" Nhap id can xoa :");
        sc.nextLine();
        String id = sc.nextLine();
        products.remove(getIndex(id));
    }

    public void timKiem(){
        System.out.println(" Nhap id can sua :");
        String ten = sc.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getTen().equals(ten)){
                System.out.println( " Thong tin san pham can tim :  \n" +
                        products.get(i).toString());
            }
        }
    }


    @Override
    public int compare(Product o1, Product o2) {
        return o2.getDonGia()- o1.getDonGia();
    }
}
