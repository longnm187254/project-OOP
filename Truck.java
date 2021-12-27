package QuanLyXe;

public class Truck extends Car {
    private int weight;
    private final static int HeSoTien = 700000;

    public Truck(int carNumber, String carOwner, int Month, int weight) {
        super(carNumber, carOwner, Month);
        this.weight = weight;
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double PriceCalculate() {
        Price = weight * HeSoTien;
        if (Month > 60) {
            Price = Price - (Price * 0.25);
        }
        setPrice(Price);
        return Price;

    }

    public void InThongTin() {
        System.out.println("Loai xe:Xe tai   " + "||Bien So Xe:" + getCarNumber() +
                "||Chu xe:" + getCarOwner() + " " +
                "||Thang duoc trong:" + getMonth() + " " +
                "||trong tai:" + getWeight() + " " +
                "||Tien:" + PriceCalculate());
    }


}
