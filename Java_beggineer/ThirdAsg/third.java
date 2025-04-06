
import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {

    private int modelNo;
    private String name;
    private int stock;

    public Car(int modelNo, String name, int stock) {
        this.modelNo = modelNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModelNo() {
        return modelNo;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    @Override
    public int compareTo(Car car) {
        return this.stock - car.stock;
    }

    @Override
    public String toString() {
        return modelNo + " " + name + " " + stock;
    }
}

public class third {

    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<>();

        carList.add(new Car(2015, "BMW", 55));
        carList.add(new Car(2020, "MG", 13));
        carList.add(new Car(2013, "Creta", 10));
        carList.add(new Car(2018, "Kia", 20));
        carList.add(new Car(2017, "Audi", 45));

        Collections.sort(carList);

        System.out.println("Sorted car list based on stock:");
        for (Car car : carList) {
            System.out.println(car);
        }
    }

}
