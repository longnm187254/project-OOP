package QuanLyXe;

import java.time.Year;

public class SmallCar extends Car {
    private final static int SmallCarPrice = 1000000;

    public SmallCar(int carNumber, String carOwner, int Month) {
        super(carNumber, carOwner, Month);
    }

    public SmallCar() {
    }


    @Override
    public double PriceCalculate() {
        Price = SmallCarPrice;
        if (Month > 60) {
            Price = Price - (Price * 0.2);
        }
        setPrice(Price);
        return Price;
    }

    public void InThongTin() {
        System.out.println("Loai xe: xe con  " + "||Bien so Xe:" + getCarNumber()  +
                "||Chu xe:" + getCarOwner() + " " +
                "||thang duoc trong:" + getMonth() + " " +
                "||Tien:" + PriceCalculate());
    }
}
