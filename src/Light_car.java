class Light_car extends Car{
    double coast;
    double consumption;
    static double lightconsumption = 0;
    Light_car(int no, int code, int mil){
        coast = 46.10;
        consumption = 12.5;
        gos_no = no;
        code_car = code;
        mileage = mil;
        more_inf = 0;
        lightconsumption+=consumption/100*mileage*coast;
    }
    static void consumption(){
        System.out.printf("Общая стоимость расходов на легковые: %f \n", lightconsumption);
    }
}