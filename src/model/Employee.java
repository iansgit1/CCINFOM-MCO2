package model;

public class Employee extends Person {
    /* ATTRIBUTES */
    private int employeeID;         // or ULID
    private String committee;
    private String position;
    private boolean availability;   // T for available and F for not || if you want to declare an enum, it should be a separate class


    /* CONSTRUCTOR(S) */    
    public Employee() {

    }


    /* GETTERS & SETTERS */
    public int getEmployeeID() {
        return employeeID;
    }

    public String getCommittee() {
        return committee;
    }

    public String getPosition() {
        return position;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setCommittee(String committee) {
        this.committee = committee;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    /* METHODS */

}