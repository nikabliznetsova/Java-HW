class Truck_car extends Car{
    double coast;
    double consumption;
    static double truckconsumption = 0;

    Truck_car(int no, int code, int mil, int vol){
        coast = 48.90;
        consumption = 12;
        gos_no = no;
        code_car = code;
        mileage = mil;
        more_inf = vol;
        truckconsumption+=consumption/100*mileage*coast;
    }
    static void consumption(){
        System.out.printf("Общая стоимость расходов на грузовые: %f \n", truckconsumption);
    }
}