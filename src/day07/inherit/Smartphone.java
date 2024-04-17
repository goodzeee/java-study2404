package day07.inherit;

public class Smartphone extends ElectronicProduct {

    int storageCapacity;

    public Smartphone(String productName, int price, String manufacturer, int storageCapacity) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.storageCapacity = storageCapacity;
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("저장 용량 : " + this.storageCapacity + " GB");
    }
}
