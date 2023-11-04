package Bai_1;

public class Vegetable {
    private String id ;
    private String name ;
    private String unit ;
    private int quantitySold;
    private int sale ;
    private double price;
    private static int ID = 1 ;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Vegetable(){}
    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }
    public double getTotalRevenue(){
        return quantitySold * (price  - price * sale / 100);
    }

    public void display(){
        System.out.printf("%-12s %-25s %-12s %-18d %-8d %-15f  %-20f" ,id , name , unit , quantitySold , sale , price , getTotalRevenue()) ;
        System.out.println();
    }
    public void fakeData(){
        id = ID +"" ;
        ID++;
        name = "ca Chua" ;
        unit = "qua" ;
        quantitySold = 25 ;
        sale = 20 ;
        price = 10 ;
    }
    public  void fakeDate2(){
        id = ID +"" ;
        ID++;
        name = "Sau Rieng" ;
        unit = "qua" ;
        quantitySold = 1 ;
        sale = 20 ;
        price = 60;
    }
    public  void fakeDate3(){
        id = ID +"" ;
        ID++;
        name = "Khoai tay" ;
        unit = "cu" ;
        quantitySold = 10 ;
        sale = 20 ;
        price = 10;
    }
}
