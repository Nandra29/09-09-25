public class car {
    int numDoors;
    boolean isElectric;

    //Constructor class
    public car() {
        numDoors = 4;
        isElectric = false;
    }
    //
    public car(int newNumDoors, boolean newIsElectric) {
        this.numDoors = newNumDoors;
        this.isElectric = newIsElectric;
    }

    public void carInfo() {
        System.out.println("Number of Doors: "+numDoors);
        System.out.println("Is Electric: "+isElectric);
    }



    
}
