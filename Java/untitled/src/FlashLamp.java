public class FlashLamp {
    //Fields
    private boolean status;
    private Battery battery;
    //Dat object Battery vao FlashLamp van chay tot -> OOP
    public FlashLamp(){
        status=false;
    }
    //Methods
    public void setBattery(Battery battery){
        this.battery=battery;
    }
    public int getBatteryInfo(){
        return battery.getEnergy();
    }
    public void light(){
        if (status==true&&battery!=null&&battery.getEnergy()>0){
            battery.decreaseEnergy();
        }
    }
    public void turnOn(){
        if (battery!=null&&battery.getEnergy()>0){
            status=true;
        }
        light();
    }
    public void turnOff(){
        status=false;
    }
    public static void main(String[] args){
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        flashLamp.setBattery(battery);
        for (int i=0; i<10; i++){
            flashLamp.turnOn();
            System.out.println("FlashLamp is on.");
            flashLamp.turnOff();
            System.out.println("FlashLamp is off.");
        }
        System.out.println("Remaining battery power: " + flashLamp.getBatteryInfo()+"% ");
    }
}
