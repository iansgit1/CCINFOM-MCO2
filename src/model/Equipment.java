package model;

public class Equipment {
    /* ATTRIBUTES */
    private int equipmentID;
    private String equipmentName;
    private static int quantity = 0;
    private boolean availability;

    /* CONSTRUCTOR */
    public Equipment() {

    }


    /* GETTERS & SETTERS */
    public int getEquipmentID() {
        return equipmentID;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setEquipmentID(int equipmentID) {
        this.equipmentID = equipmentID;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    /* METHODS */
}