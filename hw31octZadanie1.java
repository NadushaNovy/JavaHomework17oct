package hw;

public class hw31octZadanie1 {
    public static void main(String[] args) {

       double end = 15000;
        double speed = 42;
        int stepMetr = 350;
        int timeStep = 30;
        int time = 0;
        int trip = 0;
double allTime = end/((speed/60)*1000);


        int step = 1;
        while( step <= 42) {
            System.out.println("Пройденное расстояние = " + stepMetr + " м ");
            System.out.println("Время движения автобуса = " + timeStep + " cекунд");
           trip = stepMetr + 350;
            stepMetr = trip;
           time = timeStep + 30;
           timeStep = time;

            step++;

        }
       System.out.println("Общее время движения автобуса = " + allTime + "минут");










    }
}
