package auto;

public class Auto {
    private String model;
    private double motorType;

    private String transmission;
    private String fuel;

    public Auto(String model, double motorType, String transmission, String fuel) {
        this.motorType = motorType;
        this.model = model;
        this.transmission = transmission;
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Model -> " +
                model +
                " Motor Type -> "
                + motorType +
                " Transmission -> "
                + transmission + " Fuel -> " +
                fuel ;
    }

}
