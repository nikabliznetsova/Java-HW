class Car{
    int gos_no;
    int code_car;
    int mileage;
    int more_inf;

    void displayInfo(){
        System.out.printf("Код машины: %d \nГос. номер: %d \nПробег: %d \nДоп.параметр: %d\n\n", code_car, gos_no, mileage, more_inf);
    }
    // int more_inf;
    static void countconsumption(){
        double allconsumption;
        allconsumption = Light_car.lightconsumption + Truck_car.truckconsumption + Passenger_car.passconsumption + Heavy_machinery.heavyconsumption;
        System.out.printf("Общая стоимость расходов на ГСМ: %f \n", allconsumption);
    }
    static void maxconsumption(){
        String res;
        if (Light_car.lightconsumption >= Truck_car.truckconsumption){
            if (Light_car.lightconsumption >= Passenger_car.passconsumption){
                if (Light_car.lightconsumption >= Heavy_machinery.heavyconsumption){
                    res = "легковые";
                }else{
                    res = "грузовые";
                }
            }else{
                if (Passenger_car.passconsumption >= Heavy_machinery.heavyconsumption){
                    res = "пассажирские";
                }else{
                    res = "тяжелая техника";
                }
            }
        }else{
            if (Truck_car.truckconsumption >= Passenger_car.passconsumption){
                if (Truck_car.truckconsumption >= Heavy_machinery.heavyconsumption){
                    res = "грузовые";
                }else{
                    res = "тяжелая техника";
                }
            }else{
                if (Passenger_car.passconsumption >= Heavy_machinery.heavyconsumption){
                    res = "пассажирские";
                }else{
                    res = "тяжелая техника";
                }
            }
        }
        System.out.printf("Тип авто имеющий наибольшую стоимость расходов: %s \n", res);
    }

    static void minconsumption(){
        String res;
        if (Light_car.lightconsumption <= Truck_car.truckconsumption){
            if (Light_car.lightconsumption <= Passenger_car.passconsumption){
                if (Light_car.lightconsumption <= Heavy_machinery.heavyconsumption){
                    res = "легковые";
                }else{
                    res = "грузовые";
                }
            }else{
                if (Passenger_car.passconsumption <= Heavy_machinery.heavyconsumption){
                    res = "пассажирские";
                }else{
                    res = "тяжелая техника";
                }
            }
        }else{
            if (Truck_car.truckconsumption <= Passenger_car.passconsumption){
                if (Truck_car.truckconsumption <= Heavy_machinery.heavyconsumption){
                    res = "грузовые";
                }else{
                    res = "тяжелая техника";
                }
            }else{
                if (Passenger_car.passconsumption <= Heavy_machinery.heavyconsumption){
                    res = "пассажирские";
                }else{
                    res = "тяжелая техника";
                }
            }
        }
        System.out.printf("Тип авто имеющий наименьшую стоимость расходов: %s \n", res);
    }
}