package DesignPattern.StructuralDesignPattern.FacadeDesignPattern;

/*
    * hides complexity of internal system
 */
public class Client {
    public static void main(String[] args) {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        employeeFacade.addEmployee();
    }
}
