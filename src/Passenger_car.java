class Passenger_car extends Car{
    double coast;
    double consumption;
    static double passconsumption = 0;

    Passenger_car(int no, int code, int mil, int pass){
        coast = 47.50;
        consumption = 11.5;
        gos_no = no;
        code_car = code;
        mileage = mil;
        more_inf = pass;
        passconsumption+=consumption/100*mileage*coast;
    }
    static void consumption(){
        System.out.printf("Общая стоимость расходов на пассажирские: %f \n", passconsumption);
    }
}