package domain;

import java.util.ArrayList;

public class Student {
    private String id;
    private String lastName;
    private String firstName;
    private ArrayList<Address> address;
    private ArrayList<Parent> parents;
    private Degree degreeCode;

    public Student() {
        // no para
        this.id="";
        this.lastName="";
        this.firstName="";
        this.address=new ArrayList<>();
        this.parents=new ArrayList<>();
        this.degreeCode= null;
    }

    public Student(String id, String lastName, String firstName){
        this.id=id;
        this.lastName=lastName;
        this.firstName=firstName;
        this.address=new ArrayList<>();
        this.parents=new ArrayList<>();
        this.degreeCode= null;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setAddresses(ArrayList<Address> address) {
        this.address = address;
    }

    public ArrayList<Address> getAddresses() {
        return address;
    }

    public void setParents(ArrayList<Parent> parents) {
        this.parents = parents;
    }

    public ArrayList<Parent> getParents() {
        return parents;
    }

    public void setDegreeCode(Degree degreeCode) {
        this.degreeCode = degreeCode;
    }

    public Degree getDegreeCode() {
        return degreeCode;
    }
}
