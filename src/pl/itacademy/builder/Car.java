package pl.itacademy.builder;

public class Car {
    private String manufacturer;
    private String model;
    private String colour;
    private short seatsNumber;
    private int wheelsNumber;
    private double trunkCapacity;

    private Car(String manufacturer, String model, String colour, short seatsNumber, int wheelsNumber, double trunkCapacity) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.seatsNumber = seatsNumber;
        this.wheelsNumber = wheelsNumber;
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", wheelsNumber=" + wheelsNumber +
                ", trunkCapacity=" + trunkCapacity +
                '}';
    }

    public static class Builder {
        private String manufacturer;
        private String model;
        private String colour;
        private short seatsNumber;
        private int wheelsNumber;
        private double trunkCapacity;

        public Builder(String manufacturer, String model) {
            this.manufacturer = manufacturer;
            this.model = model;
        }

        public Builder withColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Builder withSeatsNumber(short seatsNumber) {
            this.seatsNumber = seatsNumber;
            return this;
        }

        public Builder withWheelsNumber(int wheelsNumber) {
            this.wheelsNumber = wheelsNumber;
            return this;
        }

        public Builder withTrunkCapacity(double trunkCapacity) {
            this.trunkCapacity = trunkCapacity;
            return this;
        }

        public Car build() {
            return new Car(manufacturer, model, colour, seatsNumber, wheelsNumber, trunkCapacity);
        }
    }
}
