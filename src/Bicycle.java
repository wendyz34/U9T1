public class Bicycle extends Vehicle{
    private int gearCount;
    public Bicycle(String name, int wheels,int gearCount){
        super(name,wheels);
        this.gearCount = gearCount;
    }
    public void ringBell(){
        System.out.println("Bicycle Ring");
    }
    public int getGearCount(){
        return gearCount;
    }
}
