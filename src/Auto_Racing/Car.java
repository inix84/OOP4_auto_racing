package Auto_Racing;
public class Car extends Transport implements Competing {
    public Car(String brand,
               String model,
               double engineVolume) {
        super(brand,
                model,
                engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Быстро");
    }
    @Override
    public void stopMoving() {
        System.out.println("Резко");
    }
    @Override
    public void pitStop() {
        System.out.println("Заезд для помощи легковым автомобилям");
    }
    public double bestLapTime() {
        return  1.4;
    }
    @Override
    public int maxSpeed() {
        return 300;
    }
}