package dz4;


import java.time.LocalDateTime;


class Ticket {
    private long rootNumber;
    private double price;
    private String place;
    private LocalDateTime date;
    private boolean isValid;
    private TypeTransport bodyType;

    public Ticket(long rootNumber,TypeTransport bodyType, double price, String place, LocalDateTime date) {
        this.rootNumber = rootNumber;
        this.price = price;
        this.place = place;
        this.date = date;
        this.isValid = true;
        this.bodyType = bodyType;
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public void setRootNumber(long rootNumber){
        this.rootNumber = rootNumber;
    }

    public TypeTransport getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(TypeTransport bodyType){
        this.bodyType = bodyType;
    }

    public double getPrice() {
        return price;
    }

     public void setPrice(double price){
        this.price = price;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place){
        this.place = place;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date){
        this.date = date;
    }
    

    @Override
    public String toString() {
        return "Ticket{" +
                "rootNumber=" + rootNumber +
                ", bodyType=" + bodyType +
                ", price=" + price +
                ", place=" + place +
                ", date=" + date +
                ", isValid=" + isValid +
                '}';
    }

    public boolean isValid() {
        return isValid;
    }

    public void cancel() {
        isValid = false;
    }
}