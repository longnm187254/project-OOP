package QuanLyXe;

public class Car {
//    private String CarType;
    private int CarNumber;
    private String CarOwner;
    protected int Month;
    protected double Price;


    public Car() {
    }

    public Car(int carNumber, String carOwner, int year) {
        this.CarNumber = carNumber;
        this.CarOwner = carOwner;
        this.Year = year;
    }
    public double PriceCalculate() {
        return Price;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(int carNumber) {
        this.CarNumber = carNumber;
    }

    public String getCarOwner() {
        return CarOwner;
    }

    public void setCarOwner(String carOwner) {
        this.CarOwner = carOwner;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void InThongTin(){}
}

