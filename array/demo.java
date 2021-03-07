package array;

public class demo {
    public static void main(String[] args) {
        cars toyta = new cars();
        toyta.setSpeed(-50000);
        toyta.setForce_brake(50);

        System.out.println("tayat brake force = "+toyta.getForce_brake());
        System.out.println("******************************************************");


        System.out.println("tayta speed=  "+toyta.getSpeed());
        System.out.println("tayta wheels Number=  "+toyta.wheelsNumber);

        cars bmw = new cars();

        System.out.println("bmw speed=  "+bmw.getSpeed());
        System.out.println("bmw wheels Number=  "+bmw.wheelsNumber);
    }
}//class
