import java.util.*;
//import java.util.Arrays;

public class main {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите массив входных данных: \n");
        String str = sc.nextLine();

        str = str.replace("\"", "");
        str = str.replace("{", "");
        str = str.replace("}", "");

        String extensionRemoved[] = str.split(", ");

        for (String i: extensionRemoved){
            String lst[] = i.split("_");

            int type = Integer.parseInt(lst[0].split("C")[1]);
            int gos_no = Integer.parseInt(lst[1].split("-")[0]);
            int mileage = Integer.parseInt(lst[1].split("-")[1]);

            if (type == 100){
                Light_car car = new Light_car(gos_no, type, mileage);
                Park.add(car);
            }
            else if (type == 200){
                int volume = Integer.parseInt(lst[1].split("-")[2]);
                Truck_car car = new Truck_car(gos_no, type, mileage, volume);
                Park.add(car);
            }
            else if (type == 300){
                int passengers = Integer.parseInt(lst[1].split("-")[2]);
                Passenger_car car = new Passenger_car(gos_no, type, mileage, passengers);
                Park.add(car);
            }
            else if (type == 400){
                int weight = Integer.parseInt(lst[1].split("-")[2]);
                Heavy_machinery car = new Heavy_machinery(gos_no, type, mileage, weight);
                Park.add(car);
            }
        }
        Light_car.consumption();
        Truck_car.consumption();
        Passenger_car.consumption();
        Heavy_machinery.consumption();
        Car.countconsumption();

        Car.minconsumption();
        Car.maxconsumption();

        Park.printlight();
        Park.printtruck();
        Park.printpass();
        Park.printheavy();
        System.out.println("\nВсё!");
    }
}
