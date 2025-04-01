package domain;
public class Address {
    private String addrType;
    private String location;

    public Address(String addrType) {
        this.addrType = addrType;
       // this.location = location;
    }
    public String getAddrType() {
        return addrType;
    }
    public String getLocation() {
        return location; }
    public void setAddrType(String addrType) {
        this.addrType = addrType; }
    public void setLocation(String location) {
        this.location = location; }
}
