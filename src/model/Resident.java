package model;

public class Resident extends Person {
    /* ATTRIBUTES */
    private int residentID;     // could be ULID


    /* CONSTRUCTOR */
    public Resident() {

    }

    public Resident(int residentID, String lastName, String firstName, String middleName, String gender, Date dateOfBirth, String civilStatus, int contactNumber, String address) {
        super(lastName, firstName, middleName, gender, dateOfBirth, civilStatus, contactNumber, address);
        this.residentID = residentID;
    }
    

    /* GETTERS & SETTERS */
    public int getResidentID() {
        return residentID;
    }

    public void setResidentID(int residentID) {
        this.residentID = residentID;
    }


    /* METHODS */

    /*
    *    public String viewProfile() {
    *
    *    }
    */
    

}
