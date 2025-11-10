public class Car implements Vehicle {
    int speed;
    int gear;

    @Override
    public void changeGear(int newGear){
        this.gear = newGear;
    }

    @Override
    public void speedUp(int increment){
        this.speed += increment;
    }

    @Override
    public void applyBrakes(int decrement){
        this.speed -=decrement;
    }

    @Override
    public void printStates() {
        System.out.println("Speed: "+speed+ ", Gear: "+ gear);
    }
}
