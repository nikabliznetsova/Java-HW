class Heavy_machinery extends Car{
    double coast;
    double consumption;
    static double heavyconsumption = 0;

    Heavy_machinery(int no, int code, int mil, int weig){
        coast = 48.90;
        consumption = 20;
        gos_no = no;
        code_car = code;
        mileage = mil;
        more_inf = weig;
        heavyconsumption+=consumption/100*mileage*coast;
    }
    static void consumption(){
        System.out.printf("Общая стоимость расходов на тяжелую технику: %f \n", heavyconsumption);
    }
}