//import Driver.*;
import Auto_Racing.*;

public class Main {
    public static void main(String[] args) {
        Car lada =new Car("Lada","2114",1.6);
        Car chevrolet = new Car("Chevrolet", "Lacetti", 1.4d);
        Car skoda = new Car("Skoda","Fabia",1.2);
        Car renault = new Car("Renault","Sandero Stapway",1.6);
        Bus volgaBus = new Bus("Волгабас", "5270", 6.8);
        Bus hyundaiBus = new Bus("Hyundai", "Universe", 12.3);
        Bus manBus = new Bus("Man", "Lion`s Coach", 12.0);
        Bus volvoBus = new Bus("Volvo","B10M",9.6 );
        Trucks manTruckTruck = new Trucks("Man","TGS 6x6",12.4);
        Trucks renaultTruck = new Trucks("Renault", "Premium",7.2);
        Trucks mersedesBenzTruck = new Trucks("Mersedes-Benz 6x6", "Arocs",10.7 );
        Trucks kamazTruck = new Trucks("КамАЗ", "4325",6.7);








        System.out.println(chevrolet);
        System.out.println(skoda);
        System.out.println(renault);
        System.out.println(lada);

        System.out.println(manBus);
        System.out.println(volgaBus);
        System.out.println(hyundaiBus);
        System.out.println(volvoBus);

        System.out.println(kamazTruck);
        System.out.println(manTruckTruck);
        System.out.println(mersedesBenzTruck);
        System.out.println(renaultTruck);

        chevrolet.pitStop();
        System.out.println(chevrolet.bestLapTime());
        System.out.println(chevrolet.maxSpeed());



    }

}