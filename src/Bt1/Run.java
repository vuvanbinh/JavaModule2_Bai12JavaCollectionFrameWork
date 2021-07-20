package Bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        Product product1 = new Product("a01","sp1",10,10);
        Product product2 = new Product("a02","sp2",10,111);
        Product product3 = new Product("a03","sp3",10,11);
        Product product4 = new Product("a04","sp4",10,131);
        Product product5 = new Product("a05","sp5",10,151);

        ProductManager binh = new ProductManager();
        binh.themSp(product1);
        binh.themSp(product2);
        binh.themSp(product3);
        binh.themSp(product4);
        binh.themSp(product5);

//        binh.suaSp();
//        binh.xoaSp();
//        System.out.println("Thong tin san pham : ");
//        binh.hienThi();
//        binh.timKiem();
//        binh.hienThi();
//        System.out.println("==============");
        Collections.sort(binh.products,binh);
        binh.hienThi();
//        System.out.println("==============");
//        Collections.reverse(binh.products);
//        binh.hienThi();

//        System.out.println(binh.compare(product1,product2));


    }



}
