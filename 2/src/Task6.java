import java.util.Objects;

public class Task6 {
    public static void main(String[] args) {

        Car toyota = new Car("Corolla", "Toyota", 2018, 2.5);
        System.out.println(toyota);
    }
}

class Car
{
    private String Name;
    private String Manufacturer;
    private int Year;
    private double EngineVolume;

    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                ", Year=" + Year +
                ", EngineVolume=" + EngineVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Year == car.Year && Double.compare(car.EngineVolume, EngineVolume) == 0 && Name.equals(car.Name) && Manufacturer.equals(car.Manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Manufacturer, Year, EngineVolume);
    }

    public String getName() {
        return Name;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getYear() {
        return Year;
    }

    public double getEngineVolume() {
        return EngineVolume;
    }

    public Car(String name, String manufacturer, int year, double engineVolume) {
        Name = name;
        Manufacturer = manufacturer;
        Year = year;
        EngineVolume = engineVolume;
    }
}
