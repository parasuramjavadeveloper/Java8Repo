package com.java8;
//Create Employee class
class Employee {
    String firstName;

    Employee() {
        System.out.println("Employee constructor - No Argument");
    }

    Employee(String firstName) {
        System.out.println("3 - Employee constructor - One Argument (i.e. String argument)");
        this.firstName = firstName;
    }

    public String getName(){
        return firstName;
    }
}

//Create EmployeeGenerator Interface
@FunctionalInterface
interface EmployeeGenerator{
    //createEmployee method returns Employee type object
    abstract Employee createEmployee(String firstName);
}
public class ConstructorReferenceUsingEmployeeClass {
    public static void main(String[] args) {

        System.out.println("1 - Constructor reference");
        System.out.println("Create reference to the Employee constructor by using Employee::new");
        EmployeeGenerator empFactory = Employee::new;
        //NOTE: The target type of this Employee::new must be a functional interface only (Example > Employee::new can be assigned to some functional interface)

        System.out.println("2 - Call createEmployee method");
        System.out.println("When EmployeeFactory.createEmployee method is called "
                + "it automatically selects the constructor by matching the arguments type");
        //Example - In this case it will select constructor with One Argument (i.e. with String argument)
        Employee emp = empFactory.createEmployee("Ankit");
        System.out.println("4 - emp.getName() > "+emp.getName());
    }
}
/*OUTPUT

1 - Constructor reference
Create reference to the Employee constructor by using Employee::new
2 - Call createEmployee method
When EmployeeFactory.createEmployee method is called it automatically selects the constructor by matching the arguments type
3 - Employee constructor - One Argument (i.e. String argument)
4 - emp.getName() > Ankit

*/