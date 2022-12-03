package Auto_Racing;
public class Trucks extends Transport implements Competing{
    public Trucks(String brand,
                  String model,
                  double engineVolume) {
        super(brand,
                model,
                engineVolume);
    }
    @Override
    public void startMoving() {
        System.out.println("Безопасно");
    }
    @Override
    public void stopMoving() {
        System.out.println("Осторожно");
    }
    @Override
    public void pitStop() {
        System.out.println("Заезд для помощт грузовикам");
    }
    @Override
    public double bestLapTime() {
        return 0.8;
    }
    @Override
    public int maxSpeed() {
        return 130;
    }
}