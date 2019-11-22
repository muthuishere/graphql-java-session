package sessions.graphql.eshop.vehicles;

public class Vehicle {
    public Vehicle(Long id, String name, String manufacturer, Long year, String fueltype, String transmission) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.year = year;
        this.fueltype = fueltype;
        this.transmission = transmission;
    }

    public Vehicle() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    String name;
    String manufacturer;
    Long year;
    Long id;
    String fueltype;
    String transmission;
}
