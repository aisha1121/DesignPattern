package DesignPattern.StructuralDesignPattern.FacadeDesignPattern;

public class EmployeeFacade {

    private EmployeeDAO employeeDAO;

    public EmployeeFacade() {
        employeeDAO = new EmployeeDAO();
    }

    public void addEmployee() {
        employeeDAO.insert();
    }
}
