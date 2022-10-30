package hw;

public class hw24octZadanie2 {
    public static void showChetValue(){
      int value = 5;
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
      if (value%2 == 0) {
          System.out.println(booleanValue1);
      }
      else {
          System.out.println(booleanValue2);
      }

    }
    public static void ShowChetNechet() {
        int value = 6;
        boolean booleanValue1 = true;
        boolean booleanValue2 = false;
        switch (value%2){
            case 0 : {
                System.out.println(booleanValue1);
                break;
            }
            default: {
                System.out.println(booleanValue2);
            }
        }
    }



    public static void main(String[] args) {
        showChetValue();
       ShowChetNechet();
    }

}
