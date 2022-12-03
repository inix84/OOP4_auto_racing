package Auto_Racing;

public abstract class Transport {

    private String brand; //«Марка»,
    private String model; //«Модель»,
    private double engineVolume; //«Объем двигателя».

    public Transport(String brand,
                     String model,
                     double engineVolume) {
        this.brand = validOrDefault(brand,"default");
        this.model = validOrDefault(model, "default");
        this.engineVolume = engineVolume >= 0.8d ? engineVolume : 0.8;
    }

    @Override
    public String toString() {
        return "Транспорт: " + getBrand() +
                ". Модель: " + getModel() +
                ". Объем двигателя: " + getEngineVolume();
    }

    public static String validOrDefault(String value, String defaultValue) {
        if (value == null || value.isBlank()) {
            return defaultValue;
        } else {
            return value;
        }
    }

    public abstract void startMoving(); //метод «начать движение»,

    public abstract void stopMoving(); //метод «закончить движение».

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
