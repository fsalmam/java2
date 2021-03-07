package array;

public class cars {
    private int speed ;
    private int force_brake;
    int no_of_charis;
    static int wheelsNumber= 4;
     // total   total()
    public void setSpeed(int newspeed){
        if(newspeed >0)
        speed = newspeed;

    }

    public int getSpeed(){return speed;}
    // () parameter give me access to get value from out side of class
    public void setForce_brake(int force_brake){
        //cars.force_brake = force_brake
        if(force_brake>0)
        this.force_brake=force_brake;
        else
            System.out.println("please enter value bigger than zero");
    }//setForce_brake
    public int getForce_brake(){return force_brake;}

}
