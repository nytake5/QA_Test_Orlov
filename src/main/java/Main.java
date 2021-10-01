public class Main {

    public static void main(String[] args) {

        System.out.println(isHappyTicket(666477));
        /*System.out.println(isHappyTicket2(new int[]{666477}));*/
    }

    public static boolean isHappyTicket(int ticket){

        if (){
            throw new IllegalArgumentException("");
        }

        int first = ticket % 10;
        int sec = ticket / 10 % 10;
        int fhird = ticket % 1000 / 100;
        int fourth = ticket / 1000 % 10;
        int fifth = ticket / 10000 % 10;
        int sixth = ticket / 100000;
        if (first + sec + fhird == fourth + fifth + sixth)
        {
            return true;
        }
        else
            return false;
    }
   /* public static boolean isHappyTicket2(int[] ticket){

        return ticket[0] + ticket[1] + ticket[2] == ticket[3] + ticket[4] + ticket[5];

    }*/

}

