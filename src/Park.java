import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Park {
    static List<Light_car> light = new ArrayList<>();
    static List<Truck_car> truck = new ArrayList<>();
    static List<Passenger_car> pass = new ArrayList<>();
    static List<Heavy_machinery> heavy = new ArrayList<>();

    static void add(Light_car car){
        light.add(car);
    }
    static void add(Truck_car car){
        truck.add(car);
    }
    static void add(Passenger_car car){
        pass.add(car);
    }
    static void add(Heavy_machinery car){
        heavy.add(car);
    }

    static void printlight(){
        System.out.printf("\nВсе легковые автомобили: \n\n");
        for (int i = 0; i < light.size()-1; i++){
            for (int j = i; j < light.size(); j++){
                if (light.get(i).mileage > light.get(j).mileage){
                    Collections.swap(light, i, j);
                }else if (light.get(i).mileage == light.get(j).mileage){
                    if (light.get(i).more_inf > light.get(j).more_inf){
                        Collections.swap(light, i, j);
                    }
                }
            }
        }
        for (Light_car car: light){
            car.displayInfo();
        }
    }
    static void printtruck(){
        System.out.printf("\nВсе грузовые автомобили: \n\n");
        for (int i = 0; i < truck.size()-1; i++){
            for (int j = i; j < truck.size(); j++){
                if (truck.get(i).mileage > truck.get(j).mileage){
                    Collections.swap(truck, i, j);
                }else if (truck.get(i).mileage == truck.get(j).mileage){
                    if (truck.get(i).more_inf > truck.get(j).more_inf){
                        Collections.swap(truck, i, j);
                    }
                }
            }
        }
        for (Truck_car car: truck){
            car.displayInfo();
        }
    }
    static void printpass(){
        System.out.printf("\nВсе пассажирские автомобили: \n\n");
        for (int i = 0; i < pass.size()-1; i++){
            for (int j = i; j < pass.size(); j++){
                if (pass.get(i).mileage > pass.get(j).mileage){
                    Collections.swap(pass, i, j);
                }else if (pass.get(i).mileage == pass.get(j).mileage){
                    if (pass.get(i).more_inf > pass.get(j).more_inf){
                        Collections.swap(pass, i, j);
                    }
                }
            }
        }
        for (Passenger_car car: pass){
            car.displayInfo();
        }
    }
    static void printheavy(){
        System.out.printf("\nВся тяжелая техника: \n\n");
        for (int i = 0; i < heavy.size()-1; i++){
            for (int j = i; j < heavy.size(); j++){
                if (heavy.get(i).mileage > heavy.get(j).mileage){
                    Collections.swap(heavy, i, j);
                }else if (heavy.get(i).mileage == heavy.get(j).mileage){
                    if (heavy.get(i).more_inf > heavy.get(j).more_inf){
                        Collections.swap(heavy, i, j);
                    }
                }
            }
        }
        for (Heavy_machinery car: heavy){
            car.displayInfo();
        }
    }
}