package Update;

public class EmployeeUpdate {
    private long empno;
    private String empName;
    UpdateAddress address;
    
    
    public long getEmpno() {
        return empno;
    }
    public void setEmpno(long empno) {
        this.empno = empno;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public UpdateAddress getAddress() {
        return address;
    }
    public void setAddress(UpdateAddress address) {
        this.address = address;
    }
    

}