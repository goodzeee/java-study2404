package day07.inherit;

public class Television extends ElectronicProduct{

    int screenSize;

    public Television(String productName, int price, String manufacturer, int screenSize) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.screenSize = screenSize;
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("screen Size : " + this.screenSize + " inches");
    }
}
