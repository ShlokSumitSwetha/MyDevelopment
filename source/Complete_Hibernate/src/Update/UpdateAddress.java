package Update;


public class UpdateAddress {
    private long id;
    private int empid;
    private String street;
    private String city;
    private String state;
    private long pinno;
    
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public long getPinno() {
        return pinno;
    }
    public void setPinno(long pinno) {
        this.pinno = pinno;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getEmpid() {
        return empid;
    }
    public void setEmpid(int empid) {
        this.empid = empid;
    }
    

}