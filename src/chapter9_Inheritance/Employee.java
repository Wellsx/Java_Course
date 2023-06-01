package chapter9_Inheritance;

public class Employee extends Person{

    private String employeeId;
    private String title;

    public Employee(){
        //calls the second superclass constructor
        super("Stefan");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
