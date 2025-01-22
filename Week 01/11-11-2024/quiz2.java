public class quiz2 {
    public static void main(String[] args) {
        int day = 15;
        System.out.println(day);
        day /=7;

        switch (day) {
            case 1:
            System.out.println("Monday");
                break;
        
            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wensday");
                break;
            
            case 4:
                System.out.println("thurday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                break;
        }

      //System.out.println();
      
    }
  }