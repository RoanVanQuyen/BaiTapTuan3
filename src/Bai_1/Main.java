package Bai_1;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in) ;
        ArrayList<Vegetable> vegetables = new ArrayList<Vegetable>() ;
        Vegetable fake = new Vegetable() ;
        Vegetable fake2 = new Vegetable() ;
        Vegetable fake3 = new Vegetable() ;
        fake3.fakeDate3();
        fake.fakeData();
        vegetables.add(fake) ;
        fake2.fakeDate2();
        vegetables.add(fake2) ;
        vegetables.add(fake3) ;
        do {
            System.out.printf("Moi ban nhap vao lua chon: ");
            int choose = Ip.nextInt();
            if (choose == 1) {
                Ip.nextLine();
                System.out.printf("Moi ban nhap vao id: ");
                String id = Ip.nextLine();
                System.out.printf("Moi ban nhap vao ten: ");
                String name = Ip.nextLine();
                System.out.printf("Moi ban nhap vao don vi tinh: ");
                String unit = Ip.nextLine();
                System.out.printf("Moi ban nhap vao so luong: ");
                int soLuong = Ip.nextInt();
                System.out.printf("Moi ban nhap vao pham tram giam gia: ");
                int sale = Ip.nextInt();
                System.out.printf("Moi ban nhap vao gia san pham: ");
                double price = Ip.nextDouble();
                Vegetable one = new Vegetable(id, name, unit, soLuong, sale, price);
                int check = 0;
                for (int i = 0; i < vegetables.size(); i++) {
                    if (vegetables.get(i).getId().equals(id)) {
                        check = 1;
                    }
                }
                if (check == 0) vegetables.add(one);
            }
            if (choose == 2) {
                System.out.printf("%-12s %-25s %-12s %-18s %-8s %-16s %-20s" , "id" , "name" , "unit" , "quantitySold" , "sale" , "price" , "revenue")  ;
                System.out.println();
                for (int i = 0; i < vegetables.size(); i++) {
                    vegetables.get(i).display();
                }
            }
            if(choose == 3){
                Collections.sort(vegetables, new Comparator<Vegetable>() {
                    @Override
                    public int compare(Vegetable o1, Vegetable o2) {
                       return (int)(o1.getTotalRevenue() - o2.getTotalRevenue()) ;
                    }
                }) ;
                System.out.println("BAN DA SAP XEP CAC LOAI RAU QUA THEO THU TU SO TIEN THU TANG DAN");
            }

            if(choose == 4){
                ArrayList<Vegetable> cuQua = vegetables ;
                Collections.sort(cuQua, new Comparator<Vegetable>() {
                    @Override
                    public int compare(Vegetable o1, Vegetable o2) {
                        return o1.getUnit().compareTo(o2.getUnit()) ;
                    }
                }) ;
                ArrayList<Vegetable> ans = new ArrayList<Vegetable>() ;
                Vegetable Vg = new Vegetable("" , "" , " " , 1,1,1);
                cuQua.add(Vg) ;
                for(int i = 0 ; i < cuQua.size() - 1 ;i++){
                    if(cuQua.get(i).getUnit().equals(cuQua.get(i+1).getUnit())){
                        ans.add(cuQua.get(i)) ;
                    }
                    else{
                        ans.add(cuQua.get(i));
                        for(int x = 0 ; x < ans.size() ; x++){
                            ans.get(x).display();
                        }
                        ans = new ArrayList<Vegetable>() ;
                    }
                }
                cuQua.remove(cuQua.size()-1)  ;
            }

            if(choose == 5){
                System.out.printf("Nhap vao ten loai rau cu qua ban muon tim kiem: ");
                Ip.nextLine() ;
                String name = Ip.nextLine() ;
                ArrayList<Vegetable> ans = new ArrayList<Vegetable>() ;
                for(int i = 0 ; i < vegetables.size() ; i++){
                    if(vegetables.get(i).getName().equals(name)){
                        ans.add(vegetables.get(i)) ;
                    }
                }
                if(ans.size() > 0){
                    System.out.println("Thong tin ve san pham co ten vua nhap la : ");
                    System.out.printf("%-12s %-25s %-12s %-18s %-8s %-16s %-20s" , "id" , "name" , "unit" , "quantitySold" , "sale" , "price" , "revenue")  ;
                    System.out.println();
                    for(int i = 0 ; i < ans.size() ; i++){
                        ans.get(i).display();
                    }
                }
                else{
                    System.out.println("Khong tim thay san pham co ten vua nhap");
                }

            }
            if(choose == 6) return;
        }while(true) ;
    }
}