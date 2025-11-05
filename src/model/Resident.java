package model;

public class Resident extends Person {
    /* ATTRIBUTES */
    private int residentID;     // could be ULID


    /* CONSTRUCTOR */
    public Resident() {

    }


    /* GETTERS & SETTERS */
    public int getResidentID() {
        return residentID;
    }

    public void setResidentID(int residentID) {
        this.residentID = residentID;
    }


    /* METHODS */

}