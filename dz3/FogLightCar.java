package dz3;

public class FogLightCar  extends Car {
    public FogLightCar(String brand, String model, Color color, TypeCar bodyType, int amountWheels,
    Fuel fuelType, GearBox gearBoxType, double engineCapacity) {
    super(brand, model, color, bodyType, amountWheels, fuelType, gearBoxType, engineCapacity);

}

    @Override
    public void movement() {} // движение


    @Override
    public  void maintenance() {} // обслуживание

    @Override
    // переключение передач
    public  boolean gearShifting() {
    return true;
    } 

    @Override
    // включение фар
    public  boolean switchHeadlightss() {
    return true;
    }  

    @Override
    // включение дворников
    public  boolean switchWipers() {
    return true;
    } 

    // включение противотуманных фар
    public boolean fogLights() {
        return true;

    }
    
}