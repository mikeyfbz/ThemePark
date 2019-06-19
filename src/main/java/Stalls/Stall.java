package Stalls;

public abstract class Stall {

    private String name;
    private String ownerName;
    private String parkingSpace;
    private int rating;

    public Stall(String name, String ownerName, String parkingSpace, int rating){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpace = parkingSpace;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getParkingSpace() {
        return parkingSpace;
    }

    public int getRating() {
        return rating;
    }
}
