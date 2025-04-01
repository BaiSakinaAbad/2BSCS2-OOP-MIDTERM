package domain;

public class Parent {
    private String parentCode;
    private String name;

    public Parent(){
        // no para
    }
    public Parent(String parentCode, String name) {
        this.parentCode = parentCode;
        this.name = name;
    }

    public String getParentCode() {
        return parentCode; }

    public String getParentName() {
        return name; }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode; }


    public void setParentName(String name) {
        this.name = name; }
}