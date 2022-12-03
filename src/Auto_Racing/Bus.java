package Auto_Racing;
public class Bus extends Transport implements Competing {
    public Bus(String brand,
               String model,
               double engineVolume) {
        super(brand,
                model,
                engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Медленно");
    }
    @Override
    public void stopMoving() {
        System.out.println("Безопасно");
    }
    @Override
    public void pitStop() {
        System.out.println("Заезд для помощи автобусам");
    }
    @Override
    public double bestLapTime() {
        return 1.2;
    }
    @Override
    public int maxSpeed() {
        return 170;
    }
}