package hw;

import java.util.Scanner;

public class hw24octSecondLevel {
    public static void timeForSleep (){
        int timeSleep = 22;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 22");
        int time = input.nextInt();
        int resultTime = timeSleep - time;
        if (resultTime > 16 ){
            System.out.println("Сейчас самое время спать"
            );}
            else if ( resultTime <=16 && resultTime >10 ) {
            System.out.println("Не переживайте, до сна больше 10 часов");
        }
        else  if (resultTime == 2){
            System.out.println("До сна 2 часа, завершайте выполнение текущей работы"
            );}
        else if (resultTime == 1) {
            System.out.println("До сна 1 час, посмотрите перед сном что-то интересное, или почитайте"
            );}
        else if (resultTime == 3) {System.out.println("До сна 3 часа, если вы голодные, то надо успеть перекусить"
        );}

              else  if(resultTime <7) {
                    System.out.println("До сна осталось меньше 7 часов");
                }



                          else   if (resultTime < 1) {
                                System.out.println("Время ложиться спать. Конец дня!"
                                );
                            }
                            else{
                                System.out.println(resultTime);


                            }
                        }




    public static void main(String[] args) {
        timeForSleep();


    }
}
