package day07.inherit;

public class ElectronicProduct {

    String productName;
    int price;
    String manufacturer;

    public void displayInfo() {
        // 제품의 정보
        System.out.println(this.productName + ", price : " + this.price + ", 제조사 : " + this.manufacturer);
        }
    }
