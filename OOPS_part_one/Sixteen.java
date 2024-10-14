//Parent Class / Super Class

/*16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.
 */

class Employee {
    private int empId;        //data field  
    private String empName;   //data field


    //constructor for the class Employee
    public Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    //method to retrun employee id
    public int getEmpId() {
        return empId;
    }
    //method to return empname
    public String getEmpName() {
        return empName;
    }

    //method to print employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}


//Child class(FactoryEmployee) extends Parent class(Employee) i.e., Child class inherits properties from the parent class.
class FactoryEmployee extends Employee {

    private int busNum;
    private boolean empBoards;

    public FactoryEmployee(int empId, String empName, int busNum, boolean empBoards) {
        super(empId, empName); //Calling the constructor which refers to the Parent Class (Super) keyword refers to parent class.

        this.busNum = busNum;
        this.empBoards = empBoards;

    }

    public int getBusNum() {
        return busNum;
    }


    public boolean isEmpBoards() {
        return empBoards;
    }


    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails(); //Calling the parent class method from the child class using the "Super" keyword.
        System.out.println("Bus Number: " + busNum);
        System.out.println("Employee Boards the Bus: " + (empBoards ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        FactoryEmployee factoryEmployee_one = new FactoryEmployee(1001, "David", 1204, true);
        FactoryEmployee factoryEmployee_two = new FactoryEmployee(1002, "John", 1204, false);

        factoryEmployee_one.displayEmployeeDetails();
        factoryEmployee_two.displayEmployeeDetails();
    }

}

